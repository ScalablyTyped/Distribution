package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnyFindOptions = typings.sequelize.mod.FindOptions[js.Any]
  /**
    * A hash of attributes to describe your search, accepting any field names. See `WhereOptions` for details.
    */
  type AnyWhereOptions = org.scalablytyped.runtime.StringDictionary[js.Array[typings.sequelize.mod.WhereOptions[js.Any]] | js.Object]
  /**
    * Options for Association Scope
    *
    * @see AssociationOptionsManyToMany
    */
  type AssociationScope = /**
    * The name of the column that will be used for the associated scope and it's value
    */
  org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The createAssociation mixin applied to models with belongsTo.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsTo(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    // setRole...
    *    createRole: Sequelize.BelongsToCreateAssociationMixin<RoleAttributes>;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to/
    * @see Instance
    */
  type BelongsToCreateAssociationMixin[TAttributes, TInstance] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.BelongsToCreateAssociationMixinOptions | typings.sequelize.mod.CreateOptions | typings.sequelize.mod.BelongsToSetAssociationMixinOptions
    ], 
    typings.bluebird.mod.^[TInstance]
  ]
  /**
    * The getAssociation mixin applied to models with belongsTo.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsTo(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttrib>, UserAttrib {
    *    getRole: Sequelize.BelongsToGetAssociationMixin<RoleInstance>;
    *    // setRole...
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to/
    * @see Instance
    */
  type BelongsToGetAssociationMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[typings.sequelize.mod.BelongsToGetAssociationMixinOptions], 
    typings.bluebird.mod.^[TInstance | scala.Null]
  ]
  /**
    * The addAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    addRole: Sequelize.BelongsToManyAddAssociationMixin<RoleInstance, RoleId, UserRoleAttributes>;
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyAddAssociationMixin[TInstance, TInstancePrimaryKey, TJoinTableAttributes] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.BelongsToManyAddAssociationMixinOptions | typings.sequelize.mod.AnyFindOptions | typings.sequelize.mod.BulkCreateOptions | typings.sequelize.mod.InstanceUpdateOptions | typings.sequelize.mod.InstanceDestroyOptions | typings.sequelize.anon.Through[TJoinTableAttributes]
    ], 
    typings.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The addAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    addRoles: Sequelize.BelongsToManyAddAssociationsMixin<RoleInstance, RoleId, UserRoleAttributes>;
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyAddAssociationsMixin[TInstance, TInstancePrimaryKey, TJoinTableAttributes] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.BelongsToManyAddAssociationsMixinOptions | typings.sequelize.mod.AnyFindOptions | typings.sequelize.mod.BulkCreateOptions | typings.sequelize.mod.InstanceUpdateOptions | typings.sequelize.mod.InstanceDestroyOptions | typings.sequelize.anon.Through[TJoinTableAttributes]
    ], 
    typings.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The countAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    countRoles: Sequelize.BelongsToManyCountAssociationsMixin;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyCountAssociationsMixin = js.Function1[
    /* options */ js.UndefOr[typings.sequelize.mod.BelongsToManyCountAssociationsMixinOptions], 
    typings.bluebird.mod.^[scala.Double]
  ]
  /**
    * The createAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    createRole: Sequelize.BelongsToManyCreateAssociationMixin<RoleAttributes, UserRoleAttributes>;
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyCreateAssociationMixin[TAttributes, TInstance, TJoinTableAttributes] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.BelongsToManyCreateAssociationMixinOptions | typings.sequelize.mod.CreateOptions | typings.sequelize.anon.Through[TJoinTableAttributes]
    ], 
    typings.bluebird.mod.^[TInstance]
  ]
  /**
    * The getAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    getRoles: Sequelize.BelongsToManyGetAssociationsMixin<RoleInstance>;
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyGetAssociationsMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[typings.sequelize.mod.BelongsToManyGetAssociationsMixinOptions], 
    typings.bluebird.mod.^[js.Array[TInstance]]
  ]
  /**
    * The hasAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    hasRole: Sequelize.BelongsToManyHasAssociationMixin<RoleInstance, RoleId>;
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyHasAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* target */ TInstance | TInstancePrimaryKey, 
    /* options */ js.UndefOr[
      typings.sequelize.mod.BelongsToManyHasAssociationMixinOptions | typings.sequelize.mod.BelongsToManyGetAssociationsMixinOptions
    ], 
    typings.bluebird.mod.^[scala.Boolean]
  ]
  /**
    * The removeAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles
    *    // hasRole...
    *    hasRoles: Sequelize.BelongsToManyHasAssociationsMixin<RoleInstance, RoleId>;
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyHasAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* targets */ js.Array[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.BelongsToManyHasAssociationsMixinOptions | typings.sequelize.mod.BelongsToManyGetAssociationsMixinOptions
    ], 
    typings.bluebird.mod.^[scala.Boolean]
  ]
  /**
    * The removeAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    removeRole: Sequelize.BelongsToManyRemoveAssociationMixin<RoleInstance, RoleId>;
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyRemoveAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociated */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.BelongsToManyRemoveAssociationMixinOptions | typings.sequelize.mod.InstanceDestroyOptions
    ], 
    typings.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The removeAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    removeRoles: Sequelize.BelongsToManyRemoveAssociationsMixin<RoleInstance, RoleId>;
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyRemoveAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociateds */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.BelongsToManyRemoveAssociationsMixinOptions | typings.sequelize.mod.InstanceDestroyOptions
    ], 
    typings.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The setAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    setRoles: Sequelize.BelongsToManySetAssociationsMixin<RoleInstance, RoleId, UserRoleAttributes>;
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManySetAssociationsMixin[TInstance, TInstancePrimaryKey, TJoinTableAttributes] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.BelongsToManySetAssociationsMixinOptions | typings.sequelize.mod.AnyFindOptions | typings.sequelize.mod.BulkCreateOptions | typings.sequelize.mod.InstanceUpdateOptions | typings.sequelize.mod.InstanceDestroyOptions | typings.sequelize.anon.Through[TJoinTableAttributes]
    ], 
    typings.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The setAssociation mixin applied to models with belongsTo.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsTo(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    setRole: Sequelize.BelongsToSetAssociationMixin<RoleInstance, RoleId>;
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to/
    * @see Instance
    */
  type BelongsToSetAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.BelongsToSetAssociationMixinOptions | typings.sequelize.mod.InstanceSaveOptions
    ], 
    typings.bluebird.mod.^[scala.Unit]
  ]
  type DataTypeBoolean = typings.sequelize.mod.DataTypeAbstract
  type DataTypeDateOnly = typings.sequelize.mod.DataTypeAbstract
  type DataTypeHStore = typings.sequelize.mod.DataTypeAbstract
  type DataTypeJSONB = typings.sequelize.mod.DataTypeAbstract
  type DataTypeJSONType = typings.sequelize.mod.DataTypeAbstract
  type DataTypeNow = typings.sequelize.mod.DataTypeAbstract
  type DataTypeTime = typings.sequelize.mod.DataTypeAbstract
  /**
    * Interface for Attributes provided for a column
    *
    * @see Sequelize.define
    */
  type DefineAttributes = /**
    * The description of a database column
    */
  org.scalablytyped.runtime.StringDictionary[
    java.lang.String | typings.sequelize.mod.DataTypeAbstract | typings.sequelize.mod.DefineAttributeColumnOptions
  ]
  /**
    * Interface for getterMethods in DefineOptions
    *
    * @see DefineOptions
    */
  type DefineGetterMethodsOptions = org.scalablytyped.runtime.StringDictionary[js.Function0[js.Any]]
  /**
    * Interface for Attributes provided for a column
    *
    * @see Sequelize.define
    */
  type DefineModelAttributes[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string | sequelize.sequelize.DataTypeAbstract | sequelize.sequelize.DefineAttributeColumnOptions}
    */ typings.sequelize.sequelizeStrings.DefineModelAttributes with org.scalablytyped.runtime.TopLevel[js.Any]
  /**
    * Interface for Define Scope Options
    *
    * @see DefineOptions
    */
  type DefineScopeOptions = /**
    * Name of the scope and it's query
    */
  org.scalablytyped.runtime.StringDictionary[typings.sequelize.mod.AnyFindOptions | js.Function]
  /**
    * Interface for setterMethods in DefineOptions
    *
    * @see DefineOptions
    */
  type DefineSetterMethodsOptions = org.scalablytyped.runtime.StringDictionary[js.Function1[/* val */ js.Any, scala.Unit]]
  /**
    * Shortcut for types used in FindOptions.attributes
    */
  type FindOptionsAttributesArray = js.Array[
    java.lang.String | typings.sequelize.mod.literal | (js.Tuple2[
      java.lang.String | typings.sequelize.mod.cast | typings.sequelize.mod.fn | typings.sequelize.mod.literal, 
      java.lang.String
    ]) | typings.sequelize.mod.fn | typings.sequelize.mod.cast
  ]
  /**
    * Shortcut for order type in FindOptions.attributes
    */
  type FindOptionsOrderArray = js.Array[
    java.lang.String | scala.Double | (typings.sequelize.mod.Model[js.Any, js.Any, js.Any]) | typings.sequelize.anon.As | typings.sequelize.mod.fn
  ]
  /**
    * GetTableName Options
    */
  type GetTableNameOptions = typings.sequelize.mod.LoggingOptions
  /**
    * The addAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    addRole: Sequelize.HasManyAddAssociationMixin<RoleInstance, RoleId>;
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyAddAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.HasManyAddAssociationMixinOptions | typings.sequelize.mod.InstanceUpdateOptions
    ], 
    typings.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The addAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    addRoles: Sequelize.HasManyAddAssociationsMixin<RoleInstance, RoleId>;
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyAddAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.HasManyAddAssociationsMixinOptions | typings.sequelize.mod.InstanceUpdateOptions
    ], 
    typings.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The countAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    countRoles: Sequelize.HasManyCountAssociationsMixin;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyCountAssociationsMixin = js.Function1[
    /* options */ js.UndefOr[typings.sequelize.mod.HasManyCountAssociationsMixinOptions], 
    typings.bluebird.mod.^[scala.Double]
  ]
  /**
    * The createAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    createRole: Sequelize.HasManyCreateAssociationMixin<RoleAttributes>;
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyCreateAssociationMixin[TAttributes, TInstance] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.HasManyCreateAssociationMixinOptions | typings.sequelize.mod.CreateOptions
    ], 
    typings.bluebird.mod.^[TInstance]
  ]
  /**
    * The getAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    getRoles: Sequelize.HasManyGetAssociationsMixin<RoleInstance>;
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyGetAssociationsMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[typings.sequelize.mod.HasManyGetAssociationsMixinOptions], 
    typings.bluebird.mod.^[js.Array[TInstance]]
  ]
  /**
    * The hasAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    hasRole: Sequelize.HasManyHasAssociationMixin<RoleInstance, RoleId>;
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyHasAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* target */ TInstance | TInstancePrimaryKey, 
    /* options */ js.UndefOr[
      typings.sequelize.mod.HasManyHasAssociationMixinOptions | typings.sequelize.mod.HasManyGetAssociationsMixinOptions
    ], 
    typings.bluebird.mod.^[scala.Boolean]
  ]
  /**
    * The removeAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles
    *    // hasRole...
    *    hasRoles: Sequelize.HasManyHasAssociationsMixin<RoleInstance, RoleId>;
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyHasAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* targets */ js.Array[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.HasManyHasAssociationsMixinOptions | typings.sequelize.mod.HasManyGetAssociationsMixinOptions
    ], 
    typings.bluebird.mod.^[scala.Boolean]
  ]
  /**
    * The removeAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    removeRole: Sequelize.HasManyRemoveAssociationMixin<RoleInstance, RoleId>;
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyRemoveAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociated */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.HasManyRemoveAssociationMixinOptions | typings.sequelize.mod.InstanceUpdateOptions
    ], 
    typings.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The removeAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    removeRoles: Sequelize.HasManyRemoveAssociationsMixin<RoleInstance, RoleId>;
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyRemoveAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociateds */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.HasManyRemoveAssociationsMixinOptions | typings.sequelize.mod.InstanceUpdateOptions
    ], 
    typings.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The setAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    setRoles: Sequelize.HasManySetAssociationsMixin<RoleInstance, RoleId>;
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManySetAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.HasManySetAssociationsMixinOptions | typings.sequelize.mod.AnyFindOptions | typings.sequelize.mod.InstanceUpdateOptions
    ], 
    typings.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The createAssociation mixin applied to models with hasOne.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasOne(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    // setRole...
    *    createRole: Sequelize.HasOneCreateAssociationMixin<RoleAttributes>;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-one/
    * @see Instance
    */
  type HasOneCreateAssociationMixin[TAttributes] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.HasOneCreateAssociationMixinOptions | typings.sequelize.mod.HasOneSetAssociationMixinOptions | typings.sequelize.mod.CreateOptions
    ], 
    typings.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The getAssociation mixin applied to models with hasOne.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasOne(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttrib>, UserAttrib {
    *    getRole: Sequelize.HasOneGetAssociationMixin<RoleInstance>;
    *    // setRole...
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-one/
    * @see Instance
    */
  type HasOneGetAssociationMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[typings.sequelize.mod.HasOneGetAssociationMixinOptions], 
    typings.bluebird.mod.^[TInstance | scala.Null]
  ]
  /**
    * The setAssociation mixin applied to models with hasOne.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasOne(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    setRole: Sequelize.HasOneSetAssociationMixin<RoleInstance, RoleId>;
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-one/
    * @see Instance
    */
  type HasOneSetAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typings.sequelize.mod.HasOneSetAssociationMixinOptions | typings.sequelize.mod.HasOneGetAssociationMixinOptions | typings.sequelize.mod.InstanceSaveOptions
    ], 
    typings.bluebird.mod.^[scala.Unit]
  ]
  /**
    * Models contains Model instances associated to their name
    */
  type Models = org.scalablytyped.runtime.StringDictionary[typings.sequelize.mod.Model[js.Any, js.Any, js.Any]]
  type ModelsHashInterface = org.scalablytyped.runtime.StringDictionary[typings.sequelize.mod.Model[js.Any, js.Any, js.Any]]
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  /**
    * A hash of attributes to describe your search. See above for examples.
    *
    * We did put Object in the end, because there where query might be a JSON Blob. It cripples a bit the
    * typesafety, but there is no way to pass the tests if we just remove it.
    */
  type Primitives = java.lang.String | scala.Double | scala.Boolean | typings.node.Buffer
  type TransactionIsolationLevel = typings.sequelize.mod.TransactionIsolationLevelReadUncommitted | typings.sequelize.mod.TransactionIsolationLevelReadCommitted | typings.sequelize.mod.TransactionIsolationLevelRepeatableRead | typings.sequelize.mod.TransactionIsolationLevelSerializable
  type TransactionIsolationLevelReadCommitted = typings.sequelize.sequelizeStrings.`READ COMMITTED`
  type TransactionIsolationLevelReadUncommitted = typings.sequelize.sequelizeStrings.`READ UNCOMMITTED`
  type TransactionIsolationLevelRepeatableRead = typings.sequelize.sequelizeStrings.`REPEATABLE READ`
  type TransactionIsolationLevelSerializable = typings.sequelize.sequelizeStrings.SERIALIZABLE
  type TransactionLockLevel = typings.sequelize.mod.TransactionLockLevelUpdate | typings.sequelize.mod.TransactionLockLevelShare | typings.sequelize.mod.TransactionLockLevelKeyShare | typings.sequelize.mod.TransactionLockLevelNoKeyUpdate
  type TransactionLockLevelKeyShare = typings.sequelize.sequelizeStrings.`KEY SHARE`
  type TransactionLockLevelNoKeyUpdate = typings.sequelize.sequelizeStrings.`NO KEY UPDATE`
  type TransactionLockLevelShare = typings.sequelize.sequelizeStrings.SHARE
  type TransactionLockLevelUpdate = typings.sequelize.sequelizeStrings.UPDATE
  type TransactionType = typings.sequelize.mod.TransactionTypeDeferred | typings.sequelize.mod.TransactionTypeImmediate | typings.sequelize.mod.TransactionTypeExclusive
  type TransactionTypeDeferred = typings.sequelize.sequelizeStrings.DEFERRED
  type TransactionTypeExclusive = typings.sequelize.sequelizeStrings.EXCLUSIVE
  type TransactionTypeImmediate = typings.sequelize.sequelizeStrings.IMMEDIATE
  type WhereOptions[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? sequelize.sequelize.Primitives | std.Array<sequelize.sequelize.Primitives> | sequelize.sequelize.WhereLogic | T[P] extends sequelize.sequelize.Primitives? null : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias sequelize.sequelize.WhereOptions<T[P]> * / object | sequelize.sequelize.col | sequelize.sequelize.and | sequelize.sequelize.or | sequelize.sequelize.WhereGeometryOptions | sequelize.sequelize.WhereNested | sequelize.sequelize.where | null}
    */ typings.sequelize.sequelizeStrings.WhereOptions with org.scalablytyped.runtime.TopLevel[T]
}
