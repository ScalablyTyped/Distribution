package typings.primereact.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ZIndexUtils {
  
  @JSImport("primereact", "ZIndexUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def get(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Double]
  inline def get(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getBase(key: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBase")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getCurrent(key: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def set(key: String, el: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set(key: String, el: HTMLElement, baseZIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], el.asInstanceOf[js.Any], baseZIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
