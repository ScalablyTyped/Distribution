package typings
package schwiftyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Args
  extends schwiftyLib.schwiftyMod.ModelClass
     with org.scalablytyped.runtime.Instantiable0[objectionLib.objectionMod.Model] {
  var BelongsToOneRelation: objectionLib.objectionMod.ObjectionNs.Relation = js.native
  var HasManyRelation: objectionLib.objectionMod.ObjectionNs.Relation = js.native
  var HasOneRelation: objectionLib.objectionMod.ObjectionNs.Relation = js.native
  var HasOneThroughRelation: objectionLib.objectionMod.ObjectionNs.Relation = js.native
  var JoinEagerAlgorithm: objectionLib.objectionMod.ObjectionNs.EagerAlgorithm = js.native
  var ManyToManyRelation: objectionLib.objectionMod.ObjectionNs.Relation = js.native
  var NaiveEagerAlgorithm: objectionLib.objectionMod.ObjectionNs.EagerAlgorithm = js.native
  var QueryBuilder: objectionLib.Anon_ForClass = js.native
  var WhereInEagerAlgorithm: objectionLib.objectionMod.ObjectionNs.EagerAlgorithm = js.native
  var columnNameMappers: objectionLib.objectionMod.ObjectionNs.ColumnNameMappers = js.native
  var dbRefProp: java.lang.String = js.native
  var defaultEagerAlgorithm: js.UndefOr[objectionLib.objectionMod.ObjectionNs.EagerAlgorithm] = js.native
  var defaultEagerOptions: js.UndefOr[objectionLib.objectionMod.ObjectionNs.EagerOptions] = js.native
  var fn: knexLib.knexMod.KnexNs.FunctionHelper = js.native
  var idColumn: java.lang.String | js.Array[java.lang.String] = js.native
  var jsonAttributes: js.Array[java.lang.String] = js.native
  var jsonSchema: objectionLib.objectionMod.ObjectionNs.JsonSchema = js.native
  var modelPaths: js.Array[java.lang.String] = js.native
  var pickJsonSchemaProperties: scala.Boolean = js.native
  var propRefRegex: stdLib.RegExp = js.native
  @JSName("raw")
  var raw_Original: knexLib.knexMod.KnexNs.RawBuilder = js.native
  var relatedFindQueryMutates: scala.Boolean = js.native
  var relatedInsertQueryMutates: scala.Boolean = js.native
  var relationMappings: objectionLib.objectionMod.ObjectionNs.RelationMappings | js.Function0[objectionLib.objectionMod.ObjectionNs.RelationMappings] = js.native
  var tableName: java.lang.String = js.native
  var uidProp: java.lang.String = js.native
  var uidRefProp: java.lang.String = js.native
  var virtualAttributes: js.Array[java.lang.String] = js.native
  def bindKnex[M](`this`: M, knex: knexLib.knexMod.Knex): M = js.native
  def bindTransaction[M](`this`: M, transaction: objectionLib.objectionMod.ObjectionNs.Transaction): M = js.native
  def createNotFoundError(): nodeLib.Error = js.native
  def createValidationError(args: objectionLib.objectionMod.ObjectionNs.CreateValidationErrorArgs): nodeLib.Error = js.native
  def createValidator(): objectionLib.objectionMod.ObjectionNs.Validator = js.native
  def fetchTableMetadata(): js.Promise[objectionLib.objectionMod.ObjectionNs.TableMetadata] = js.native
  def fetchTableMetadata(opt: objectionLib.objectionMod.ObjectionNs.FetchTableMetadataOptions): js.Promise[objectionLib.objectionMod.ObjectionNs.TableMetadata] = js.native
  def fromDatabaseJson[M](
    `this`: objectionLib.objectionMod.ObjectionNs.Constructor[M],
    row: objectionLib.objectionMod.ObjectionNs.Pojo
  ): M = js.native
  // fromJson and fromDatabaseJson both return an instance of Model, not a Model class:
  def fromJson[M](
    `this`: objectionLib.objectionMod.ObjectionNs.Constructor[M],
    json: objectionLib.objectionMod.ObjectionNs.Pojo
  ): M = js.native
  def fromJson[M](
    `this`: objectionLib.objectionMod.ObjectionNs.Constructor[M],
    json: objectionLib.objectionMod.ObjectionNs.Pojo,
    opt: objectionLib.objectionMod.ObjectionNs.ModelOptions
  ): M = js.native
  def getRelations(): org.scalablytyped.runtime.StringDictionary[objectionLib.objectionMod.ObjectionNs.Relation] = js.native
  def knex(): knexLib.knexMod.Knex = js.native
  def knex(knex: knexLib.knexMod.Knex): knexLib.knexMod.Knex = js.native
  def knexQuery(): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def loadRelated[QM /* <: objectionLib.objectionMod.ObjectionNs.Model */](
    `this`: objectionLib.objectionMod.ObjectionNs.Constructor[QM],
    model: QM,
    expression: objectionLib.objectionMod.ObjectionNs.RelationExpression
  ): objectionLib.objectionMod.ObjectionNs.QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: objectionLib.objectionMod.ObjectionNs.Model */](
    `this`: objectionLib.objectionMod.ObjectionNs.Constructor[QM],
    model: QM,
    expression: objectionLib.objectionMod.ObjectionNs.RelationExpression,
    filters: objectionLib.objectionMod.ObjectionNs.Filters[QM]
  ): objectionLib.objectionMod.ObjectionNs.QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: objectionLib.objectionMod.ObjectionNs.Model */](
    `this`: objectionLib.objectionMod.ObjectionNs.Constructor[QM],
    model: QM,
    expression: objectionLib.objectionMod.ObjectionNs.RelationExpression,
    filters: objectionLib.objectionMod.ObjectionNs.Filters[QM],
    trxOrKnex: knexLib.knexMod.Knex
  ): objectionLib.objectionMod.ObjectionNs.QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: objectionLib.objectionMod.ObjectionNs.Model */](
    `this`: objectionLib.objectionMod.ObjectionNs.Constructor[QM],
    model: QM,
    expression: objectionLib.objectionMod.ObjectionNs.RelationExpression,
    filters: objectionLib.objectionMod.ObjectionNs.Filters[QM],
    trxOrKnex: objectionLib.objectionMod.ObjectionNs.Transaction
  ): objectionLib.objectionMod.ObjectionNs.QueryBuilderYieldingOne[QM] = js.native
  // loadRelated is overloaded to support both Model and Model[] variants:
  def loadRelated[QM /* <: objectionLib.objectionMod.ObjectionNs.Model */](
    `this`: objectionLib.objectionMod.ObjectionNs.Constructor[QM],
    models: js.Array[QM],
    expression: objectionLib.objectionMod.ObjectionNs.RelationExpression
  ): objectionLib.objectionMod.ObjectionNs.QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def loadRelated[QM /* <: objectionLib.objectionMod.ObjectionNs.Model */](
    `this`: objectionLib.objectionMod.ObjectionNs.Constructor[QM],
    models: js.Array[QM],
    expression: objectionLib.objectionMod.ObjectionNs.RelationExpression,
    filters: objectionLib.objectionMod.ObjectionNs.Filters[QM]
  ): objectionLib.objectionMod.ObjectionNs.QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def loadRelated[QM /* <: objectionLib.objectionMod.ObjectionNs.Model */](
    `this`: objectionLib.objectionMod.ObjectionNs.Constructor[QM],
    models: js.Array[QM],
    expression: objectionLib.objectionMod.ObjectionNs.RelationExpression,
    filters: objectionLib.objectionMod.ObjectionNs.Filters[QM],
    trxOrKnex: knexLib.knexMod.Knex
  ): objectionLib.objectionMod.ObjectionNs.QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def loadRelated[QM /* <: objectionLib.objectionMod.ObjectionNs.Model */](
    `this`: objectionLib.objectionMod.ObjectionNs.Constructor[QM],
    models: js.Array[QM],
    expression: objectionLib.objectionMod.ObjectionNs.RelationExpression,
    filters: objectionLib.objectionMod.ObjectionNs.Filters[QM],
    trxOrKnex: objectionLib.objectionMod.ObjectionNs.Transaction
  ): objectionLib.objectionMod.ObjectionNs.QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def omitImpl(f: js.Function2[/* obj */ js.Object, /* prop */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def query[QM /* <: objectionLib.objectionMod.ObjectionNs.Model */](`this`: objectionLib.objectionMod.ObjectionNs.Constructor[QM]): objectionLib.objectionMod.ObjectionNs.QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def query[QM /* <: objectionLib.objectionMod.ObjectionNs.Model */](`this`: objectionLib.objectionMod.ObjectionNs.Constructor[QM], trxOrKnex: knexLib.knexMod.Knex): objectionLib.objectionMod.ObjectionNs.QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def query[QM /* <: objectionLib.objectionMod.ObjectionNs.Model */](
    `this`: objectionLib.objectionMod.ObjectionNs.Constructor[QM],
    trxOrKnex: objectionLib.objectionMod.ObjectionNs.Transaction
  ): objectionLib.objectionMod.ObjectionNs.QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def raw(sql: java.lang.String, bindings: (knexLib.Value | knexLib.knexMod.KnexNs.QueryBuilder)*): knexLib.knexMod.KnexNs.Raw = js.native
  def raw(sql: java.lang.String, bindings: js.Array[knexLib.Value | knexLib.knexMod.KnexNs.QueryBuilder]): knexLib.knexMod.KnexNs.Raw = js.native
  def raw(sql: java.lang.String, bindings: knexLib.knexMod.ValueMap): knexLib.knexMod.KnexNs.Raw = js.native
  def raw(value: knexLib.Value): knexLib.knexMod.KnexNs.Raw = js.native
  // This can only be used as a subquery so the result model type is irrelevant.
  def relatedQuery(relationName: java.lang.String): objectionLib.objectionMod.ObjectionNs.QueryBuilder[_, js.Array[_], js.Array[_]] = js.native
  def tableMetadata(): objectionLib.objectionMod.ObjectionNs.TableMetadata = js.native
  def tableMetadata(opt: objectionLib.objectionMod.ObjectionNs.TableMetadataOptions): objectionLib.objectionMod.ObjectionNs.TableMetadata = js.native
  def traverse(
    filterConstructor: objectionLib.Anon_Args,
    models: js.Array[objectionLib.objectionMod.ObjectionNs.Model],
    traverser: objectionLib.objectionMod.ObjectionNs.TraverserFunction
  ): scala.Unit = js.native
  def traverse(
    filterConstructor: objectionLib.Anon_Args,
    models: objectionLib.objectionMod.ObjectionNs.Model,
    traverser: objectionLib.objectionMod.ObjectionNs.TraverserFunction
  ): scala.Unit = js.native
  def traverse(
    models: js.Array[objectionLib.objectionMod.ObjectionNs.Model],
    traverser: objectionLib.objectionMod.ObjectionNs.TraverserFunction
  ): scala.Unit = js.native
  def traverse(
    models: objectionLib.objectionMod.ObjectionNs.Model,
    traverser: objectionLib.objectionMod.ObjectionNs.TraverserFunction
  ): scala.Unit = js.native
}

