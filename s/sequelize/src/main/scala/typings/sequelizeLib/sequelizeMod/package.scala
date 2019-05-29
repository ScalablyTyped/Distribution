package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sequelizeMod {
  type AnyFindOptions = FindOptions[js.Any]
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
      BelongsToCreateAssociationMixinOptions | CreateOptions | BelongsToSetAssociationMixinOptions
    ], 
    bluebirdLib.bluebirdMod.^[TInstance]
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
    /* options */ js.UndefOr[BelongsToGetAssociationMixinOptions], 
    bluebirdLib.bluebirdMod.^[TInstance | scala.Null]
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
      BelongsToManyAddAssociationMixinOptions | AnyFindOptions | BulkCreateOptions | InstanceUpdateOptions | InstanceDestroyOptions | sequelizeLib.Anon_Through[TJoinTableAttributes]
    ], 
    bluebirdLib.bluebirdMod.^[scala.Unit]
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
      BelongsToManyAddAssociationsMixinOptions | AnyFindOptions | BulkCreateOptions | InstanceUpdateOptions | InstanceDestroyOptions | sequelizeLib.Anon_Through[TJoinTableAttributes]
    ], 
    bluebirdLib.bluebirdMod.^[scala.Unit]
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
    /* options */ js.UndefOr[BelongsToManyCountAssociationsMixinOptions], 
    bluebirdLib.bluebirdMod.^[scala.Double]
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
      BelongsToManyCreateAssociationMixinOptions | CreateOptions | sequelizeLib.Anon_Through[TJoinTableAttributes]
    ], 
    bluebirdLib.bluebirdMod.^[TInstance]
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
    /* options */ js.UndefOr[BelongsToManyGetAssociationsMixinOptions], 
    bluebirdLib.bluebirdMod.^[js.Array[TInstance]]
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
      BelongsToManyHasAssociationMixinOptions | BelongsToManyGetAssociationsMixinOptions
    ], 
    bluebirdLib.bluebirdMod.^[scala.Boolean]
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
      BelongsToManyHasAssociationsMixinOptions | BelongsToManyGetAssociationsMixinOptions
    ], 
    bluebirdLib.bluebirdMod.^[scala.Boolean]
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
    /* options */ js.UndefOr[BelongsToManyRemoveAssociationMixinOptions | InstanceDestroyOptions], 
    bluebirdLib.bluebirdMod.^[scala.Unit]
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
    /* options */ js.UndefOr[BelongsToManyRemoveAssociationsMixinOptions | InstanceDestroyOptions], 
    bluebirdLib.bluebirdMod.^[scala.Unit]
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
      BelongsToManySetAssociationsMixinOptions | AnyFindOptions | BulkCreateOptions | InstanceUpdateOptions | InstanceDestroyOptions | sequelizeLib.Anon_Through[TJoinTableAttributes]
    ], 
    bluebirdLib.bluebirdMod.^[scala.Unit]
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
    /* options */ js.UndefOr[BelongsToSetAssociationMixinOptions | InstanceSaveOptions], 
    bluebirdLib.bluebirdMod.^[scala.Unit]
  ]
  type DataTypeBoolean = DataTypeAbstract
  type DataTypeDateOnly = DataTypeAbstract
  type DataTypeHStore = DataTypeAbstract
  type DataTypeJSONB = DataTypeAbstract
  type DataTypeJSONType = DataTypeAbstract
  type DataTypeNow = DataTypeAbstract
  type DataTypeTime = DataTypeAbstract
  /**
    * Interface for Attributes provided for a column
    *
    * @see Sequelize.define
    */
  type DefineAttributes = /**
    * The description of a database column
    */
  org.scalablytyped.runtime.StringDictionary[java.lang.String | DataTypeAbstract | DefineAttributeColumnOptions]
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
  type DefineModelAttributes[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: string | sequelize.sequelize.DataTypeAbstract | sequelize.sequelize.DefineAttributeColumnOptions}
    */ sequelizeLib.sequelizeLibStrings.DefineModelAttributes with js.Any
  /**
    * Interface for Define Scope Options
    *
    * @see DefineOptions
    */
  type DefineScopeOptions = /**
    * Name of the scope and it's query
    */
  org.scalablytyped.runtime.StringDictionary[AnyFindOptions | js.Function]
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
    java.lang.String | literal | (js.Tuple2[java.lang.String | cast | fn | literal, java.lang.String]) | fn | cast
  ]
  /**
    * Shortcut for order type in FindOptions.attributes
    */
  type FindOptionsOrderArray = js.Array[
    java.lang.String | scala.Double | (Model[js.Any, js.Any, js.Any]) | sequelizeLib.Anon_As | fn
  ]
  /**
    * GetTableName Options
    */
  type GetTableNameOptions = LoggingOptions
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
    /* options */ js.UndefOr[HasManyAddAssociationMixinOptions | InstanceUpdateOptions], 
    bluebirdLib.bluebirdMod.^[scala.Unit]
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
    /* options */ js.UndefOr[HasManyAddAssociationsMixinOptions | InstanceUpdateOptions], 
    bluebirdLib.bluebirdMod.^[scala.Unit]
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
    /* options */ js.UndefOr[HasManyCountAssociationsMixinOptions], 
    bluebirdLib.bluebirdMod.^[scala.Double]
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
    /* options */ js.UndefOr[HasManyCreateAssociationMixinOptions | CreateOptions], 
    bluebirdLib.bluebirdMod.^[TInstance]
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
    /* options */ js.UndefOr[HasManyGetAssociationsMixinOptions], 
    bluebirdLib.bluebirdMod.^[js.Array[TInstance]]
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
    /* options */ js.UndefOr[HasManyHasAssociationMixinOptions | HasManyGetAssociationsMixinOptions], 
    bluebirdLib.bluebirdMod.^[scala.Boolean]
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
    /* options */ js.UndefOr[HasManyHasAssociationsMixinOptions | HasManyGetAssociationsMixinOptions], 
    bluebirdLib.bluebirdMod.^[scala.Boolean]
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
    /* options */ js.UndefOr[HasManyRemoveAssociationMixinOptions | InstanceUpdateOptions], 
    bluebirdLib.bluebirdMod.^[scala.Unit]
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
    /* options */ js.UndefOr[HasManyRemoveAssociationsMixinOptions | InstanceUpdateOptions], 
    bluebirdLib.bluebirdMod.^[scala.Unit]
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
    /* options */ js.UndefOr[HasManySetAssociationsMixinOptions | AnyFindOptions | InstanceUpdateOptions], 
    bluebirdLib.bluebirdMod.^[scala.Unit]
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
      HasOneCreateAssociationMixinOptions | HasOneSetAssociationMixinOptions | CreateOptions
    ], 
    bluebirdLib.bluebirdMod.^[scala.Unit]
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
    /* options */ js.UndefOr[HasOneGetAssociationMixinOptions], 
    bluebirdLib.bluebirdMod.^[TInstance | scala.Null]
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
      HasOneSetAssociationMixinOptions | HasOneGetAssociationMixinOptions | InstanceSaveOptions
    ], 
    bluebirdLib.bluebirdMod.^[scala.Unit]
  ]
  /**
    * Models contains Model instances associated to their name
    */
  type Models = org.scalablytyped.runtime.StringDictionary[Model[js.Any, js.Any, js.Any]]
  type ModelsHashInterface = org.scalablytyped.runtime.StringDictionary[Model[js.Any, js.Any, js.Any]]
  type OperatorsAliases = stdLib.Partial[sequelizeLib.Anon_Adjacent]
  /**
    * A hash of attributes to describe your search. See above for examples.
    *
    * We did put Object in the end, because there where query might be a JSON Blob. It cripples a bit the
    * typesafety, but there is no way to pass the tests if we just remove it.
    */
  type Primitives = java.lang.String | scala.Double | scala.Boolean | nodeLib.Buffer
  type TransactionIsolationLevel = TransactionIsolationLevelReadUncommitted | TransactionIsolationLevelReadCommitted | TransactionIsolationLevelRepeatableRead | TransactionIsolationLevelSerializable
  type TransactionIsolationLevelReadCommitted = sequelizeLib.sequelizeLibStrings.`READ COMMITTED`
  type TransactionIsolationLevelReadUncommitted = sequelizeLib.sequelizeLibStrings.`READ UNCOMMITTED`
  type TransactionIsolationLevelRepeatableRead = sequelizeLib.sequelizeLibStrings.`REPEATABLE READ`
  type TransactionIsolationLevelSerializable = sequelizeLib.sequelizeLibStrings.SERIALIZABLE
  type TransactionLockLevel = TransactionLockLevelUpdate | TransactionLockLevelShare | TransactionLockLevelKeyShare | TransactionLockLevelNoKeyUpdate
  type TransactionLockLevelKeyShare = sequelizeLib.sequelizeLibStrings.`KEY SHARE`
  type TransactionLockLevelNoKeyUpdate = sequelizeLib.sequelizeLibStrings.`NO KEY UPDATE`
  type TransactionLockLevelShare = sequelizeLib.sequelizeLibStrings.SHARE
  type TransactionLockLevelUpdate = sequelizeLib.sequelizeLibStrings.UPDATE
  type TransactionType = TransactionTypeDeferred | TransactionTypeImmediate | TransactionTypeExclusive
  type TransactionTypeDeferred = sequelizeLib.sequelizeLibStrings.DEFERRED
  type TransactionTypeExclusive = sequelizeLib.sequelizeLibStrings.EXCLUSIVE
  type TransactionTypeImmediate = sequelizeLib.sequelizeLibStrings.IMMEDIATE
  /**
    * Logic of where statement
    */
  type WhereLogic = stdLib.Partial[sequelizeLib.Anon_]
  type WhereOptions[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? sequelize.sequelize.Primitives | std.Array<sequelize.sequelize.Primitives> | sequelize.sequelize.WhereLogic | T[P] extends sequelize.sequelize.Primitives? null : object | sequelize.sequelize.col | sequelize.sequelize.and | sequelize.sequelize.or | sequelize.sequelize.WhereGeometryOptions | sequelize.sequelize.WhereNested | sequelize.sequelize.where | null}
    */ sequelizeLib.sequelizeLibStrings.WhereOptions with T
}
