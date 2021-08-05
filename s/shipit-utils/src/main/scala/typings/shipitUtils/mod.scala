package typings.shipitUtils

import typings.shipitUtils.anon.Typeofshipit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shipit-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def equalValues(value: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("equalValues")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getShipit(gruntOrShipit: GruntOrShipit): Typeofshipit = ^.asInstanceOf[js.Dynamic].applyDynamic("getShipit")(gruntOrShipit.asInstanceOf[js.Any]).asInstanceOf[Typeofshipit]
  
  inline def registerTask(gruntOrShipit: GruntOrShipit, name: String, dependenciesOrTask: js.Array[String]): Typeofshipit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTask")(gruntOrShipit.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dependenciesOrTask.asInstanceOf[js.Any])).asInstanceOf[Typeofshipit]
  inline def registerTask(gruntOrShipit: GruntOrShipit, name: String, dependenciesOrTask: EmptyCallback): Typeofshipit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTask")(gruntOrShipit.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dependenciesOrTask.asInstanceOf[js.Any])).asInstanceOf[Typeofshipit]
  
  inline def runTask(gruntOrShipit: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runTask")(gruntOrShipit.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type EmptyCallback = js.Function0[Unit]
  
  type GruntOrShipit = Typeofshipit | js.Object
}
