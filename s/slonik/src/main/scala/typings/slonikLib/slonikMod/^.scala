package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slonik", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val sql: SqlTaggedTemplateType = js.native
  def createBenchmarkingInterceptor(): InterceptorType = js.native
  def createBigintTypeParser(): TypeParserType[scala.Double] = js.native
  def createFieldNameTransformationInterceptor(configuration: slonikLib.Anon_Field): InterceptorType = js.native
  def createInterceptorPreset(): js.Array[InterceptorType] = js.native
  def createPool(connectionConfiguration: DatabaseConfigurationType): DatabasePoolType = js.native
  def createPool(
    connectionConfiguration: DatabaseConfigurationType,
    clientUserConfiguration: ClientUserConfigurationType[_]
  ): DatabasePoolType = js.native
  def createQueryNormalizationInterceptor(): InterceptorType = js.native
  def createQueryNormalizationInterceptor(configuration: slonikLib.Anon_StripComments): InterceptorType = js.native
  def createTimestampTypeParser(): TypeParserType[scala.Double | scala.Null] = js.native
  def createTimestampWithTimeZoneTypeParser(): TypeParserType[scala.Double | scala.Null] = js.native
  def createTypeParserPreset(): js.Array[TypeParserType[_]] = js.native
}

