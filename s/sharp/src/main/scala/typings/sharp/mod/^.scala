package typings.sharp.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  //#region Constructor functions
  /**
    * Creates a sharp instance from an image
    * @param input Buffer containing JPEG, PNG, WebP, GIF, SVG, TIFF or raw pixel image data, or String containing the path to an JPEG, PNG, WebP, GIF, SVG or TIFF image file.
    * @param options Object with optional attributes.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def apply(): Sharp = js.native
  def apply(input: js.UndefOr[scala.Nothing], options: SharpOptions): Sharp = js.native
  def apply(input: String): Sharp = js.native
  def apply(input: String, options: SharpOptions): Sharp = js.native
  def apply(input: Buffer): Sharp = js.native
  def apply(input: Buffer, options: SharpOptions): Sharp = js.native
  def apply(options: SharpOptions): Sharp = js.native
}
