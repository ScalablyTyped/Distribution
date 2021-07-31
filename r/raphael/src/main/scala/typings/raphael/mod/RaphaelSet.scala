package typings.raphael.mod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelSet[TTechnology /* <: RaphaelTechnology */]
  extends StObject
     with ArrayLike[
      RaphaelElement[
        TTechnology, 
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ]
    ]
     with RaphaelBaseElement[TTechnology] {
  
  /**
    * Removes all elements from the set
    */
  def clear(): Unit = js.native
  
  /**
    * Removes given element from the set
    * @param element An element to remove from the set.
    * @return `true` if object was found and removed from the set
    */
  def exclude(
    element: RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ]
  ): Boolean = js.native
  
  /**
    * Executes given function for each element in the set.
    *
    * If callback function returns `false` it will stop the loop running.
    *
    * @typeparam ThisContext Type of the this context for the callback.
    * @param callback Callback that is invoked with each element in this set.
    * @param thisContext Optional this context that is passed to the callback.
    * @return this set for chaining.
    */
  def forEach[ThisContext](
    callback: js.ThisFunction1[
      /* this */ ThisContext, 
      /* element */ RaphaelElement[
        TTechnology, 
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ], 
      Boolean | Unit
    ]
  ): this.type = js.native
  def forEach[ThisContext](
    callback: js.ThisFunction1[
      /* this */ ThisContext, 
      /* element */ RaphaelElement[
        TTechnology, 
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ], 
      Boolean | Unit
    ],
    thisArg: ThisContext
  ): this.type = js.native
  
  /**
    * Removes last element and returns it.
    * @return The last element in this set, if any.
    */
  def pop(): js.UndefOr[
    RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ]
  ] = js.native
  
  /**
    * Adds each argument to the current set.
    * @return this set for chaining.
    */
  def push(
    elements: (RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ])*
  ): this.type = js.native
  
  /**
    * Removes given element from the set.
    * @param index Position of the deletion
    * @param count Number of element to remove
    * @param elementsToAdd Elements to insert at the given position.
    * @return The set elements that were deleted.
    */
  def splice(
    index: Double,
    count: Double,
    elementsToAdd: (RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ])*
  ): RaphaelSet[TTechnology] = js.native
}
