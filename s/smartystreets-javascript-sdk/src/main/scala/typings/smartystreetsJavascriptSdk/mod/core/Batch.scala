package typings.smartystreetsJavascriptSdk.mod.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smartystreets-javascript-sdk", "core.Batch")
@js.native
class Batch () extends js.Object {
  
  def add(lookup: Lookup): Unit = js.native
  
  def clear(): Unit = js.native
  
  def getByIndex(index: Double): Lookup = js.native
  
  def getByInputId(inputId: String): js.Array[Lookup] = js.native
  
  def isEmpty(): Boolean = js.native
  
  def lenght(): Double = js.native
  
  var lookups: js.Array[Lookup] = js.native
  
  def lookupsHasRoomForLookup(): Boolean = js.native
}
