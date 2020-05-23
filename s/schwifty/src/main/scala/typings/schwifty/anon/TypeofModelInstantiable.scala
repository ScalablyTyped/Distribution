package typings.schwifty.anon

import org.scalablytyped.runtime.Instantiable0
import typings.knex.mod.QueryBuilder
import typings.objection.anon.TypeofQueryBuilder
import typings.objection.mod.AnyQueryBuilder
import typings.objection.mod.ArrayRelatedQueryBuilder
import typings.objection.mod.ColumnNameMappers
import typings.objection.mod.CreateValidationErrorArgs
import typings.objection.mod.EagerAlgorithm
import typings.objection.mod.EagerOptions
import typings.objection.mod.FetchGraphOptions
import typings.objection.mod.FetchTableMetadataOptions
import typings.objection.mod.FunctionBuilder
import typings.objection.mod.FunctionFunction
import typings.objection.mod.GraphOptions
import typings.objection.mod.JSONSchema
import typings.objection.mod.Model
import typings.objection.mod.ModelOptions
import typings.objection.mod.Modifiers
import typings.objection.mod.PartialModelObject
import typings.objection.mod.QueryBuilderType
import typings.objection.mod.RawBuilder
import typings.objection.mod.RawFunction
import typings.objection.mod.ReferenceBuilder
import typings.objection.mod.ReferenceFunction
import typings.objection.mod.Relation
import typings.objection.mod.RelationExpression
import typings.objection.mod.RelationMappings
import typings.objection.mod.RelationMappingsThunk
import typings.objection.mod.RelationType
import typings.objection.mod.Relations
import typings.objection.mod.SingleQueryBuilder
import typings.objection.mod.StaticHookArguments
import typings.objection.mod.TableMetadata
import typings.objection.mod.TableMetadataOptions
import typings.objection.mod.TransactionOrKnex
import typings.objection.mod.Transaction_
import typings.objection.mod.TraverserFunction
import typings.objection.mod.Validator
import typings.schwifty.mod.ModelClass
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofModelInstantiable
  extends ModelClass
     with Instantiable0[Model] {
  var BelongsToOneRelation: RelationType = js.native
  var HasManyRelation: RelationType = js.native
  var HasOneRelation: RelationType = js.native
  var HasOneThroughRelation: RelationType = js.native
  // Deprecated
  var JoinEagerAlgorithm: EagerAlgorithm = js.native
  var ManyToManyRelation: RelationType = js.native
  // Deprecated
  var NaiveEagerAlgorithm: EagerAlgorithm = js.native
  var QueryBuilder: TypeofQueryBuilder = js.native
  // Deprecated
  var WhereInEagerAlgorithm: EagerAlgorithm = js.native
  var columnNameMappers: ColumnNameMappers = js.native
  var dbRefProp: String = js.native
  // Deprecated
  var defaultEagerAlgorithm: js.UndefOr[EagerAlgorithm] = js.native
  // Deprecated
  var defaultEagerOptions: js.UndefOr[EagerOptions] = js.native
  var defaultGraphOptions: js.UndefOr[GraphOptions] = js.native
  @JSName("fn")
  var fn_Original: FunctionFunction = js.native
  var idColumn: String | js.Array[String] = js.native
  var jsonAttributes: js.Array[String] = js.native
  var jsonSchema: JSONSchema = js.native
  var modelPaths: js.Array[String] = js.native
  var modifiers: Modifiers[AnyQueryBuilder] = js.native
  var pickJsonSchemaProperties: Boolean = js.native
  var propRefRegex: RegExp = js.native
  @JSName("raw")
  var raw_Original: RawFunction = js.native
  @JSName("ref")
  var ref_Original: ReferenceFunction = js.native
  var relatedFindQueryMutates: Boolean = js.native
  var relatedInsertQueryMutates: Boolean = js.native
  var relationMappings: RelationMappings | RelationMappingsThunk = js.native
  var tableName: String = js.native
  var uidProp: String = js.native
  var uidRefProp: String = js.native
  var virtualAttributes: js.Array[String] = js.native
  def afterDelete(args: StaticHookArguments[_, _]): js.Any = js.native
  def afterFind(args: StaticHookArguments[_, _]): js.Any = js.native
  def afterInsert(args: StaticHookArguments[_, _]): js.Any = js.native
  def afterUpdate(args: StaticHookArguments[_, _]): js.Any = js.native
  def beforeDelete(args: StaticHookArguments[_, _]): js.Any = js.native
  def beforeFind(args: StaticHookArguments[_, _]): js.Any = js.native
  def beforeInsert(args: StaticHookArguments[_, _]): js.Any = js.native
  def beforeUpdate(args: StaticHookArguments[_, _]): js.Any = js.native
  def bindKnex[M](trxOrKnex: TransactionOrKnex): M = js.native
  def bindTransaction[M](trxOrKnex: TransactionOrKnex): M = js.native
  def createNotFoundError(): Error = js.native
  def createValidationError(args: CreateValidationErrorArgs): Error = js.native
  def createValidator(): Validator = js.native
  def fetchGraph[M /* <: Model */](modelOrObject: js.Array[PartialModelObject[M]], expression: RelationExpression[M]): QueryBuilderType[M] = js.native
  def fetchGraph[M /* <: Model */](
    modelOrObject: js.Array[PartialModelObject[M]],
    expression: RelationExpression[M],
    options: FetchGraphOptions
  ): QueryBuilderType[M] = js.native
  def fetchGraph[M /* <: Model */](modelOrObject: PartialModelObject[M], expression: RelationExpression[M]): SingleQueryBuilder[QueryBuilderType[M]] = js.native
  def fetchGraph[M /* <: Model */](
    modelOrObject: PartialModelObject[M],
    expression: RelationExpression[M],
    options: FetchGraphOptions
  ): SingleQueryBuilder[QueryBuilderType[M]] = js.native
  def fetchTableMetadata(): js.Promise[TableMetadata] = js.native
  def fetchTableMetadata(opt: FetchTableMetadataOptions): js.Promise[TableMetadata] = js.native
  def fn(functionName: String, arguments: js.Any*): FunctionBuilder = js.native
  def fromDatabaseJson[M /* <: Model */](json: js.Object): M = js.native
  def fromJson[M /* <: Model */](json: js.Object): M = js.native
  def fromJson[M /* <: Model */](json: js.Object, opt: ModelOptions): M = js.native
  def getRelation(name: String): Relation = js.native
  def getRelations(): Relations = js.native
  def knex(): typings.knex.mod.Knex[_, js.Array[_]] = js.native
  def knex(knex: typings.knex.mod.Knex[_, js.Array[_]]): typings.knex.mod.Knex[_, js.Array[_]] = js.native
  def knexQuery(): QueryBuilder[_, _] = js.native
  // Deprecated
  def loadRelated[M /* <: Model */](modelOrObject: js.Array[PartialModelObject[M]], expression: RelationExpression[M]): QueryBuilderType[M] = js.native
  def loadRelated[M /* <: Model */](
    modelOrObject: js.Array[PartialModelObject[M]],
    expression: RelationExpression[M],
    modifiers: Modifiers[QueryBuilderType[M]]
  ): QueryBuilderType[M] = js.native
  def loadRelated[M /* <: Model */](
    modelOrObject: js.Array[PartialModelObject[M]],
    expression: RelationExpression[M],
    modifiers: Modifiers[QueryBuilderType[M]],
    trxOrKnex: TransactionOrKnex
  ): QueryBuilderType[M] = js.native
  // Deprecated
  def loadRelated[M /* <: Model */](modelOrObject: PartialModelObject[M], expression: RelationExpression[M]): SingleQueryBuilder[QueryBuilderType[M]] = js.native
  def loadRelated[M /* <: Model */](
    modelOrObject: PartialModelObject[M],
    expression: RelationExpression[M],
    modifiers: Modifiers[QueryBuilderType[M]]
  ): SingleQueryBuilder[QueryBuilderType[M]] = js.native
  def loadRelated[M /* <: Model */](
    modelOrObject: PartialModelObject[M],
    expression: RelationExpression[M],
    modifiers: Modifiers[QueryBuilderType[M]],
    trxOrKnex: TransactionOrKnex
  ): SingleQueryBuilder[QueryBuilderType[M]] = js.native
  def query[M /* <: Model */](): QueryBuilderType[M] = js.native
  def query[M /* <: Model */](trxOrKnex: TransactionOrKnex): QueryBuilderType[M] = js.native
  def raw(sql: String, bindings: js.Any*): RawBuilder = js.native
  def ref(expression: String): ReferenceBuilder = js.native
  def relatedQuery[RM /* <: Model */](relationName: String): QueryBuilderType[RM] = js.native
  def relatedQuery[RM /* <: Model */](relationName: String, trxOrKnex: TransactionOrKnex): QueryBuilderType[RM] = js.native
  def relatedQuery[M /* <: Model */, K /* <: /* keyof M */ String */](relationName: K): ArrayRelatedQueryBuilder[
    /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any
  ] = js.native
  def relatedQuery[M /* <: Model */, K /* <: /* keyof M */ String */](relationName: K, trxOrKnex: TransactionOrKnex): ArrayRelatedQueryBuilder[
    /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any
  ] = js.native
  def startTransaction(): js.Promise[Transaction_] = js.native
  def startTransaction(knexOrTransaction: TransactionOrKnex): js.Promise[Transaction_] = js.native
  def tableMetadata(): TableMetadata = js.native
  def tableMetadata(opt: TableMetadataOptions): TableMetadata = js.native
  def transaction[T](callback: js.Function1[/* trx */ Transaction_, js.Promise[T]]): js.Promise[T] = js.native
  def transaction[T](trxOrKnex: TransactionOrKnex, callback: js.Function1[/* trx */ Transaction_, js.Promise[T]]): js.Promise[T] = js.native
  def traverse(
    filterConstructor: typings.objection.anon.TypeofModel,
    models: js.Array[Model],
    traverser: TraverserFunction
  ): Unit = js.native
  def traverse(filterConstructor: typings.objection.anon.TypeofModel, models: Model, traverser: TraverserFunction): Unit = js.native
  def traverse(models: js.Array[Model], traverser: TraverserFunction): Unit = js.native
  def traverse(models: Model, traverser: TraverserFunction): Unit = js.native
}

