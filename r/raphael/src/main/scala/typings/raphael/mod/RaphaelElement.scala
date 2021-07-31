package typings.raphael.mod

import typings.raphael.raphaelStrings.SVG
import typings.raphael.raphaelStrings.VML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelElement[TTechnology /* <: RaphaelTechnology */, TNode /* <: /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any */]
  extends StObject
     with RaphaelBaseElement[TTechnology] {
  
  /**
    * Unique id of the element. Especially useful when you want to listen to events of the element, because all
    * events are fired in format `<module>.<action>.<id>`. Also useful for the {@link RaphaelPaper.getById} method.
    */
  var id: Double = js.native
  
  /** Reference to the next element in the hierarchy. */
  var next: (RaphaelElement[
    TTechnology, 
    /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
  ]) | Null = js.native
  
  /**
    * Gives you a reference to the DOM object, so you can assign event handlers or just mess around.
    *
    * Note: __Don’t mess with it.__
    */
  var node: TNode = js.native
  
  /** Internal reference to paper where object drawn. Mainly for use in plugins and element extensions. */
  var paper: RaphaelPaper[TTechnology] = js.native
  
  /** Reference to the previous element in the hierarchy. */
  var prev: (RaphaelElement[
    TTechnology, 
    /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
  ]) | Null = js.native
  
  /** Internal reference to Raphaël object, in case it is not available. */
  var raphael: js.UndefOr[RaphaelStatic[SVG | VML]] = js.native
  
  /** The type of this element, e.g. `circle` or `path`. */
  var `type`: RaphaelShapeType | String = js.native
}
