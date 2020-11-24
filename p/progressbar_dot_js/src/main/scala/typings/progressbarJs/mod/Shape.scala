package typings.progressbarJs.mod

import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("progressbar.js", "Shape")
@js.native
/**
  * `Line`, `Circle` or `SemiCircle` shaped progress bar. Appends SVG to container.
  * @param container - Element where SVG is added.
  * @param [opts] - Options for path drawing.
  * @see {@link https://progressbarjs.readthedocs.io/en/latest/api/shape/#new-shapecontainer-options}
  */
class Shape ()
  extends typings.progressbarJs.shapeMod.^ {
  def this(container: String) = this()
  def this(container: SVGPathElement) = this()
  def this(container: String, opts: PathDrawingOptions) = this()
  def this(container: Null, opts: PathDrawingOptions) = this()
  def this(container: SVGPathElement, opts: PathDrawingOptions) = this()
}
