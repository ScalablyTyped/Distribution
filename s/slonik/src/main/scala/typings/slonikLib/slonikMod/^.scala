package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slonik", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val sql: slonikLib.slonikMod.SqlTaggedTemplateType = js.native
  def createBenchmarkingInterceptor(): slonikLib.slonikMod.InterceptorType = js.native
  def createBigintTypeParser(): slonikLib.slonikMod.TypeParserType[scala.Double] = js.native
  def createFieldNameTransformationInterceptor(configuration: slonikLib.Anon_Field): slonikLib.slonikMod.InterceptorType = js.native
  def createInterceptorPreset(): js.Array[slonikLib.slonikMod.InterceptorType] = js.native
  def createPool(connectionConfiguration: slonikLib.slonikMod.DatabaseConfigurationType): slonikLib.slonikMod.DatabasePoolType = js.native
  def createPool(
    connectionConfiguration: slonikLib.slonikMod.DatabaseConfigurationType,
    clientUserConfiguration: slonikLib.slonikMod.ClientUserConfigurationType[_]
  ): slonikLib.slonikMod.DatabasePoolType = js.native
  def createQueryNormalizationInterceptor(): slonikLib.slonikMod.InterceptorType = js.native
  def createQueryNormalizationInterceptor(configuration: slonikLib.Anon_StripComments): slonikLib.slonikMod.InterceptorType = js.native
  def createTimestampTypeParser(): slonikLib.slonikMod.TypeParserType[scala.Double | scala.Null] = js.native
  def createTimestampWithTimeZoneTypeParser(): slonikLib.slonikMod.TypeParserType[scala.Double | scala.Null] = js.native
  def createTypeParserPreset(): js.Array[slonikLib.slonikMod.TypeParserType[_]] = js.native
}

