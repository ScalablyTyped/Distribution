package typings.randomName

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("random-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def first(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[String]
  
  @scala.inline
  def last(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[String]
  
  @scala.inline
  def middle(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("middle")().asInstanceOf[String]
  
  @scala.inline
  def place(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("place")().asInstanceOf[String]
}
