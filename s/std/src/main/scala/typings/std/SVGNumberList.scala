package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGNumberList defines a list of SVGNumber objects. */
@js.native
trait SVGNumberList extends /* index */ NumberDictionary[SVGNumber] {
  
  def appendItem(newItem: SVGNumber): SVGNumber = js.native
  
  def clear(): Unit = js.native
  
  def getItem(index: Double): SVGNumber = js.native
  
  def initialize(newItem: SVGNumber): SVGNumber = js.native
  
  def insertItemBefore(newItem: SVGNumber, index: Double): SVGNumber = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SVGNumber]] = js.native
  
  val length: Double = js.native
  
  val numberOfItems: Double = js.native
  
  def removeItem(index: Double): SVGNumber = js.native
  
  def replaceItem(newItem: SVGNumber, index: Double): SVGNumber = js.native
}
