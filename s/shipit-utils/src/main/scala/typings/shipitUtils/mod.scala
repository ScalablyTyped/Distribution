package typings.shipitUtils

import typings.shipitUtils.anon.Typeofshipit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shipit-utils", "equalValues")
  @js.native
  def equalValues(value: js.Array[_]): Unit = js.native
  
  @JSImport("shipit-utils", "getShipit")
  @js.native
  def getShipit(gruntOrShipit: GruntOrShipit): Typeofshipit = js.native
  
  @JSImport("shipit-utils", "registerTask")
  @js.native
  def registerTask(gruntOrShipit: GruntOrShipit, name: String, dependenciesOrTask: js.Array[String]): Typeofshipit = js.native
  @JSImport("shipit-utils", "registerTask")
  @js.native
  def registerTask(gruntOrShipit: GruntOrShipit, name: String, dependenciesOrTask: EmptyCallback): Typeofshipit = js.native
  
  @JSImport("shipit-utils", "runTask")
  @js.native
  def runTask(gruntOrShipit: js.Object): Unit = js.native
  
  type EmptyCallback = js.Function0[Unit]
  
  type GruntOrShipit = Typeofshipit | js.Object
}
