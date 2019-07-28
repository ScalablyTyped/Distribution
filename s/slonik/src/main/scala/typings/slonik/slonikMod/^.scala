package typings.slonik.slonikMod

import typings.slonik.Anon_Field
import typings.slonik.Anon_StripComments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slonik", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val sql: SqlTaggedTemplateType = js.native
  def createBenchmarkingInterceptor(): InterceptorType = js.native
  def createBigintTypeParser(): TypeParserType[Double] = js.native
  def createFieldNameTransformationInterceptor(configuration: Anon_Field): InterceptorType = js.native
  def createInterceptorPreset(): js.Array[InterceptorType] = js.native
  def createPool(connectionConfiguration: DatabaseConfigurationType): DatabasePoolType = js.native
  def createPool(
    connectionConfiguration: DatabaseConfigurationType,
    clientUserConfiguration: ClientUserConfigurationType
  ): DatabasePoolType = js.native
  def createQueryNormalizationInterceptor(): InterceptorType = js.native
  def createQueryNormalizationInterceptor(configuration: Anon_StripComments): InterceptorType = js.native
  def createSqlTag(): SqlTaggedTemplateType = js.native
  def createSqlTag(configuration: SqlTagConfigurationType): SqlTaggedTemplateType = js.native
  def createTimestampTypeParser(): TypeParserType[Double | Null] = js.native
  def createTimestampWithTimeZoneTypeParser(): TypeParserType[Double | Null] = js.native
  def createTypeParserPreset(): js.Array[TypeParserType[_]] = js.native
}

