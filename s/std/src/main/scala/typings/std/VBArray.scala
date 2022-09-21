package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables reading from a COM safe array, which might have an alternate lower bound, or multiple dimensions.
  */
@js.native
trait VBArray[T] extends StObject {
  
  /**
    * Returns the number of dimensions (1-based).
    */
  /* standard scripthost */
  def dimensions(): Double = js.native
  
  /**
    * Takes an index for each dimension in the array, and returns the item at the corresponding location.
    */
  /* standard scripthost */
  def getItem(dimension1Index: Double, dimensionNIndexes: Double*): T = js.native
  
  /**
    * Returns the smallest available index for a given dimension.
    * @param dimension 1-based dimension (defaults to 1)
    */
  /* standard scripthost */
  def lbound(): Double = js.native
  def lbound(dimension: Double): Double = js.native
  
  /**
    * Returns a Javascript array with all the elements in the VBArray. If there are multiple dimensions,
    * each successive dimension is appended to the end of the array.
    * Example: [[1,2,3],[4,5,6]] becomes [1,2,3,4,5,6]
    */
  /* standard scripthost */
  def toArray(): js.Array[T] = js.native
  
  /**
    * Returns the largest available index for a given dimension.
    * @param dimension 1-based dimension (defaults to 1)
    */
  /* standard scripthost */
  def ubound(): Double = js.native
  def ubound(dimension: Double): Double = js.native
}
