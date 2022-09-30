package typings.sphereEngineBrowser.global

import typings.sphereEngineBrowser.FontOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a font for rendering text. This can be either RFN (Sphere raster font format) or a
  * TrueType font.
  */
@JSGlobal("Font")
@js.native
open class Font protected ()
  extends StObject
     with typings.sphereEngineBrowser.Font {
  /**
    * Construct a new `Font` from a given font file. The font is usable immediately, but text will
    * not be rendered until it loads completely.
    * @param fileName SphereFS path of an RFN format font file.
    * @param size     The size of the font when rendered, in pixels (not points!). Has no effect
    *                 for RFN fonts.
    * @param options  Options for creating the `Font` object.
    */
  def this(fileName: String) = this()
  def this(fileName: String, size: Double) = this()
  def this(fileName: String, size: Double, options: FontOptions) = this()
  def this(fileName: String, size: Unit, options: FontOptions) = this()
}
object Font {
  
  @JSGlobal("Font")
  @js.native
  val ^ : js.Any = js.native
  
  /** The default font provided by the engine. */
  /* static member */
  @JSGlobal("Font.Default")
  @js.native
  val Default: typings.sphereEngineBrowser.Font = js.native
  
  /**
    * Load a font in the background and construct a new `Font` for it once it's ready.
    * @async
    * @param fileName SphereFS path of an RFN format font file.
    * @param size     The size of the font when rendered, in pixels (not points!). Has no effect
    *                 for RFN fonts.
    * @param options  Options for creating the `Font` object.
    * @returns A promise for a newly constructed `Font` object.
    */
  /* static member */
  inline def fromFile(fileName: String): js.Promise[typings.sphereEngineBrowser.Font] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(fileName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.sphereEngineBrowser.Font]]
  inline def fromFile(fileName: String, size: Double): js.Promise[typings.sphereEngineBrowser.Font] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(fileName.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.sphereEngineBrowser.Font]]
  inline def fromFile(fileName: String, size: Double, options: FontOptions): js.Promise[typings.sphereEngineBrowser.Font] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(fileName.asInstanceOf[js.Any], size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.sphereEngineBrowser.Font]]
  inline def fromFile(fileName: String, size: Unit, options: FontOptions): js.Promise[typings.sphereEngineBrowser.Font] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(fileName.asInstanceOf[js.Any], size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.sphereEngineBrowser.Font]]
}
