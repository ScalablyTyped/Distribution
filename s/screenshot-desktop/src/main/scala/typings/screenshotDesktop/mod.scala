package typings.screenshotDesktop

import typings.node.bufferMod.global.Buffer
import typings.screenshotDesktop.anon.Filename
import typings.screenshotDesktop.anon.Format
import typings.screenshotDesktop.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Buffer]]
  inline def apply(options: Filename): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(options: Format): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  @JSImport("screenshot-desktop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(): js.Promise[js.Array[Id]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[js.Promise[js.Array[Id]]]
  
  inline def listDisplays(): js.Promise[js.Array[Id]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listDisplays")().asInstanceOf[js.Promise[js.Array[Id]]]
  
  type DisplayID = Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.screenshotDesktop.screenshotDesktopStrings.bmp
    - typings.screenshotDesktop.screenshotDesktopStrings.emf
    - typings.screenshotDesktop.screenshotDesktopStrings.exif
    - typings.screenshotDesktop.screenshotDesktopStrings.jpg
    - typings.screenshotDesktop.screenshotDesktopStrings.jpeg
    - typings.screenshotDesktop.screenshotDesktopStrings.gif
    - typings.screenshotDesktop.screenshotDesktopStrings.png
    - typings.screenshotDesktop.screenshotDesktopStrings.tiff
    - typings.screenshotDesktop.screenshotDesktopStrings.wmf
  */
  trait ImageFormat extends StObject
  object ImageFormat {
    
    inline def bmp: typings.screenshotDesktop.screenshotDesktopStrings.bmp = "bmp".asInstanceOf[typings.screenshotDesktop.screenshotDesktopStrings.bmp]
    
    inline def emf: typings.screenshotDesktop.screenshotDesktopStrings.emf = "emf".asInstanceOf[typings.screenshotDesktop.screenshotDesktopStrings.emf]
    
    inline def exif: typings.screenshotDesktop.screenshotDesktopStrings.exif = "exif".asInstanceOf[typings.screenshotDesktop.screenshotDesktopStrings.exif]
    
    inline def gif: typings.screenshotDesktop.screenshotDesktopStrings.gif = "gif".asInstanceOf[typings.screenshotDesktop.screenshotDesktopStrings.gif]
    
    inline def jpeg: typings.screenshotDesktop.screenshotDesktopStrings.jpeg = "jpeg".asInstanceOf[typings.screenshotDesktop.screenshotDesktopStrings.jpeg]
    
    inline def jpg: typings.screenshotDesktop.screenshotDesktopStrings.jpg = "jpg".asInstanceOf[typings.screenshotDesktop.screenshotDesktopStrings.jpg]
    
    inline def png: typings.screenshotDesktop.screenshotDesktopStrings.png = "png".asInstanceOf[typings.screenshotDesktop.screenshotDesktopStrings.png]
    
    inline def tiff: typings.screenshotDesktop.screenshotDesktopStrings.tiff = "tiff".asInstanceOf[typings.screenshotDesktop.screenshotDesktopStrings.tiff]
    
    inline def wmf: typings.screenshotDesktop.screenshotDesktopStrings.wmf = "wmf".asInstanceOf[typings.screenshotDesktop.screenshotDesktopStrings.wmf]
  }
}
