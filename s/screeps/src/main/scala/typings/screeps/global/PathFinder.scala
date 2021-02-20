package typings.screeps.global

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PathFinder extends Shortcut {
  
  @JSGlobal("PathFinder")
  @js.native
  val ^ : typings.screeps.PathFinder = js.native
  
  /**
    * Container for custom navigation cost data.
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("PathFinder.CostMatrix")
  @js.native
  /**
    * Creates a new CostMatrix containing 0's for all positions.
    */
  class CostMatrix ()
    extends typings.screeps.CostMatrix
  
  type _To = typings.screeps.PathFinder
  
  /* This means you don't have to write `^`, but can instead just say `PathFinder.foo` */
  override def _to: typings.screeps.PathFinder = ^
}
