package typings.quixote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QElementList extends StObject {
  
  // Retrieve an element from the list. Positive and negative indices are allowed. Throws an exception if the index is out of bounds.
  def at(index: Double): QElement = js.native
  def at(index: Double, nickname: String): QElement = js.native
  
  // Determine the number of elements in the list.
  def length(): Double = js.native
}
