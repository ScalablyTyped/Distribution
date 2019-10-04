package typings.schwifty

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.knex.knexMod.FunctionHelper
import typings.knex.knexMod.Knex
import typings.knex.knexMod.QueryBuilder
import typings.knex.knexMod.Raw
import typings.knex.knexMod.RawBinding
import typings.knex.knexMod.RawBuilder
import typings.knex.knexMod.SafePartial
import typings.knex.knexMod.Value
import typings.knex.knexMod.ValueDict
import typings.objection.TypeofClassQueryBuilder
import typings.objection.objectionMod.ColumnNameMappers
import typings.objection.objectionMod.Constructor
import typings.objection.objectionMod.CreateValidationErrorArgs
import typings.objection.objectionMod.EagerAlgorithm
import typings.objection.objectionMod.EagerOptions
import typings.objection.objectionMod.FetchTableMetadataOptions
import typings.objection.objectionMod.Filters
import typings.objection.objectionMod.JsonSchema
import typings.objection.objectionMod.Model
import typings.objection.objectionMod.ModelOptions
import typings.objection.objectionMod.Modifiers
import typings.objection.objectionMod.Pojo
import typings.objection.objectionMod.QueryBuilderYieldingOne
import typings.objection.objectionMod.Relation
import typings.objection.objectionMod.RelationExpression
import typings.objection.objectionMod.RelationMappings
import typings.objection.objectionMod.TableMetadata
import typings.objection.objectionMod.TableMetadataOptions
import typings.objection.objectionMod.Transaction
import typings.objection.objectionMod.TraverserFunction
import typings.objection.objectionMod.Validator
import typings.schwifty.schwiftyMod.ModelClass
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassModelArgs
  extends ModelClass
     with Instantiable0[Model] {
  var BelongsToOneRelation: Relation = js.native
  var HasManyRelation: Relation = js.native
  var HasOneRelation: Relation = js.native
  var HasOneThroughRelation: Relation = js.native
  var JoinEagerAlgorithm: EagerAlgorithm = js.native
  var ManyToManyRelation: Relation = js.native
  var NaiveEagerAlgorithm: EagerAlgorithm = js.native
  var QueryBuilder: TypeofClassQueryBuilder = js.native
  var WhereInEagerAlgorithm: EagerAlgorithm = js.native
  var columnNameMappers: ColumnNameMappers = js.native
  var dbRefProp: String = js.native
  var defaultEagerAlgorithm: js.UndefOr[EagerAlgorithm] = js.native
  var defaultEagerOptions: js.UndefOr[EagerOptions] = js.native
  var fn: FunctionHelper = js.native
  var idColumn: String | js.Array[String] = js.native
  var jsonAttributes: js.Array[String] = js.native
  var jsonSchema: JsonSchema = js.native
  var modelPaths: js.Array[String] = js.native
  var modifiers: Modifiers = js.native
  var pickJsonSchemaProperties: Boolean = js.native
  var propRefRegex: RegExp = js.native
  @JSName("raw")
  var raw_Original: RawBuilder[_, _] = js.native
  var relatedFindQueryMutates: Boolean = js.native
  var relatedInsertQueryMutates: Boolean = js.native
  var relationMappings: RelationMappings | js.Function0[RelationMappings] = js.native
  var tableName: String = js.native
  var uidProp: String = js.native
  var uidRefProp: String = js.native
  var virtualAttributes: js.Array[String] = js.native
  def bindKnex[M](`this`: M, knex: Knex[_, js.Array[_]]): M = js.native
  def bindTransaction[M](`this`: M, transaction: Transaction): M = js.native
  def createNotFoundError(): Error = js.native
  def createValidationError(args: CreateValidationErrorArgs): Error = js.native
  def createValidator(): Validator = js.native
  def fetchTableMetadata(): js.Promise[TableMetadata] = js.native
  def fetchTableMetadata(opt: FetchTableMetadataOptions): js.Promise[TableMetadata] = js.native
  def fromDatabaseJson[M](`this`: Constructor[M], row: Pojo): M = js.native
  // fromJson and fromDatabaseJson both return an instance of Model, not a Model class:
  def fromJson[M](`this`: Constructor[M], json: Pojo): M = js.native
  def fromJson[M](`this`: Constructor[M], json: Pojo, opt: ModelOptions): M = js.native
  def getRelations(): StringDictionary[Relation] = js.native
  def knex(): Knex[_, js.Array[_]] = js.native
  def knex(knex: Knex[_, js.Array[_]]): Knex[_, js.Array[_]] = js.native
  def knexQuery(): QueryBuilder[_, js.Array[SafePartial[_]]] = js.native
  def loadRelated[QM /* <: Model */](`this`: Constructor[QM], model: QM, expression: RelationExpression): QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: Model */](`this`: Constructor[QM], model: QM, expression: RelationExpression, filters: Filters[QM]): QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: Model */](
    `this`: Constructor[QM],
    model: QM,
    expression: RelationExpression,
    filters: Filters[QM],
    trxOrKnex: Knex[_, js.Array[_]]
  ): QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: Model */](
    `this`: Constructor[QM],
    model: QM,
    expression: RelationExpression,
    filters: Filters[QM],
    trxOrKnex: Transaction
  ): QueryBuilderYieldingOne[QM] = js.native
  // loadRelated is overloaded to support both Model and Model[] variants:
  def loadRelated[QM /* <: Model */](`this`: Constructor[QM], models: js.Array[QM], expression: RelationExpression): typings.objection.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: Model */](
    `this`: Constructor[QM],
    models: js.Array[QM],
    expression: RelationExpression,
    filters: Filters[QM]
  ): typings.objection.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: Model */](
    `this`: Constructor[QM],
    models: js.Array[QM],
    expression: RelationExpression,
    filters: Filters[QM],
    trxOrKnex: Knex[_, js.Array[_]]
  ): typings.objection.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: Model */](
    `this`: Constructor[QM],
    models: js.Array[QM],
    expression: RelationExpression,
    filters: Filters[QM],
    trxOrKnex: Transaction
  ): typings.objection.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def omitImpl(f: js.Function2[/* obj */ js.Object, /* prop */ String, Unit]): Unit = js.native
  def query[QM /* <: Model */](`this`: Constructor[QM]): typings.objection.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def query[QM /* <: Model */](`this`: Constructor[QM], trxOrKnex: Knex[_, js.Array[_]]): typings.objection.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def query[QM /* <: Model */](`this`: Constructor[QM], trxOrKnex: Transaction): typings.objection.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def raw[TResult2](sql: String, bindings: RawBinding*): Raw[TResult2] = js.native
  def raw[TResult2](sql: String, bindings: js.Array[RawBinding]): Raw[TResult2] = js.native
  def raw[TResult2](sql: String, bindings: ValueDict): Raw[TResult2] = js.native
  def raw[TResult2](value: Value): Raw[TResult2] = js.native
  // This can only be used as a subquery so the result model type is irrelevant.
  def relatedQuery(relationName: String): typings.objection.objectionMod.QueryBuilder[
    _, 
    js.Array[_], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def tableMetadata(): TableMetadata = js.native
  def tableMetadata(opt: TableMetadataOptions): TableMetadata = js.native
  def traverse(
    filterConstructor: typings.objection.TypeofClassModel,
    models: js.Array[Model],
    traverser: TraverserFunction
  ): Unit = js.native
  def traverse(filterConstructor: typings.objection.TypeofClassModel, models: Model, traverser: TraverserFunction): Unit = js.native
  def traverse(models: js.Array[Model], traverser: TraverserFunction): Unit = js.native
  def traverse(models: Model, traverser: TraverserFunction): Unit = js.native
}

