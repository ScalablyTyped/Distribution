package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutocompleteProvided[TDoc] extends StObject {
  
  var currentRefinement: String = js.native
  
  var hits: js.Array[Hit[TDoc]] = js.native
  
  def refine(): Unit = js.native
  def refine(value: String): Unit = js.native
}
