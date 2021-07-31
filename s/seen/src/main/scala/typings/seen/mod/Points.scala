package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Points {
  
  @JSImport("seen", "Points")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def X(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("X")().asInstanceOf[Point]
  
  @scala.inline
  def Y(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("Y")().asInstanceOf[Point]
  
  @scala.inline
  def Z(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("Z")().asInstanceOf[Point]
  
  @scala.inline
  def ZERO(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("ZERO")().asInstanceOf[Point]
}
