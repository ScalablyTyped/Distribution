package typings
package atSindresorhusJimpLib.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jimp", JSImport.Namespace)
@js.native
class ^ protected ()
  extends atSindresorhusJimpLib.JimpNs.Jimp {
  def this(data: nodeLib.Buffer) = this()
  def this(image: atSindresorhusJimpLib.JimpNs.Jimp) = this()
  def this(path: java.lang.String) = this()
  def this(data: nodeLib.Buffer, cb: atSindresorhusJimpLib.JimpNs.ImageCallback) = this()
  def this(image: atSindresorhusJimpLib.JimpNs.Jimp, cb: atSindresorhusJimpLib.JimpNs.ImageCallback) = this()
  def this(path: java.lang.String, cb: atSindresorhusJimpLib.JimpNs.ImageCallback) = this()
  def this(w: scala.Double, h: scala.Double) = this()
  def this(w: scala.Double, h: scala.Double, background: scala.Double) = this()
  def this(w: scala.Double, h: scala.Double, cb: atSindresorhusJimpLib.JimpNs.ImageCallback) = this()
  def this(w: scala.Double, h: scala.Double, background: scala.Double, cb: atSindresorhusJimpLib.JimpNs.ImageCallback) = this()
}

@JSImport("jimp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // used to auto resizing etc.
  var AUTO: scala.Double = js.native
  var EDGE_CROP: scala.Double = js.native
  // Edge Handling
  var EDGE_EXTEND: scala.Double = js.native
  var EDGE_WRAP: scala.Double = js.native
  var FONT_SANS_10_BLACK: java.lang.String = js.native
  var FONT_SANS_128_BLACK: java.lang.String = js.native
  var FONT_SANS_128_WHITE: java.lang.String = js.native
  var FONT_SANS_12_BLACK: java.lang.String = js.native
  var FONT_SANS_14_BLACK: java.lang.String = js.native
  var FONT_SANS_16_BLACK: java.lang.String = js.native
  var FONT_SANS_16_WHITE: java.lang.String = js.native
  var FONT_SANS_32_BLACK: java.lang.String = js.native
  var FONT_SANS_32_WHITE: java.lang.String = js.native
  var FONT_SANS_64_BLACK: java.lang.String = js.native
  var FONT_SANS_64_WHITE: java.lang.String = js.native
  // Font locations
  var FONT_SANS_8_BLACK: java.lang.String = js.native
  var FONT_SANS_8_WHITE: java.lang.String = js.native
  var HORIZONTAL_ALIGN_CENTER: scala.Double = js.native
  // Align modes for cover, contain, bit masks
  var HORIZONTAL_ALIGN_LEFT: scala.Double = js.native
  var HORIZONTAL_ALIGN_RIGHT: scala.Double = js.native
  var MIME_BMP: java.lang.String = js.native
  var MIME_GIF: java.lang.String = js.native
  var MIME_JGD: java.lang.String = js.native
  var MIME_JPEG: java.lang.String = js.native
  // supported mime types
  var MIME_PNG: java.lang.String = js.native
  var MIME_X_MS_BMP: java.lang.String = js.native
  // PNG filter types
  var PNG_FILTER_AUTO: scala.Double = js.native
  var PNG_FILTER_AVERAGE: scala.Double = js.native
  var PNG_FILTER_NONE: scala.Double = js.native
  var PNG_FILTER_PAETH: scala.Double = js.native
  var PNG_FILTER_SUB: scala.Double = js.native
  var PNG_FILTER_UP: scala.Double = js.native
  var RESIZE_BEZIER: java.lang.String = js.native
  var RESIZE_BICUBIC: java.lang.String = js.native
  var RESIZE_BILINEAR: java.lang.String = js.native
  var RESIZE_HERMITE: java.lang.String = js.native
  // resize methods
  var RESIZE_NEAREST_NEIGHBOR: java.lang.String = js.native
  var VERTICAL_ALIGN_BOTTOM: scala.Double = js.native
  var VERTICAL_ALIGN_MIDDLE: scala.Double = js.native
  var VERTICAL_ALIGN_TOP: scala.Double = js.native
  def colorDiff(rgba1: atSindresorhusJimpLib.JimpNs.RGBA, rgba2: atSindresorhusJimpLib.JimpNs.RGB): scala.Double = js.native
  def colorDiff(rgba1: atSindresorhusJimpLib.JimpNs.RGBA, rgba2: atSindresorhusJimpLib.JimpNs.RGBA): scala.Double = js.native
  def colorDiff(rgba1: atSindresorhusJimpLib.JimpNs.RGB, rgba2: atSindresorhusJimpLib.JimpNs.RGB): scala.Double = js.native
  def colorDiff(rgba1: atSindresorhusJimpLib.JimpNs.RGB, rgba2: atSindresorhusJimpLib.JimpNs.RGBA): scala.Double = js.native
  def diff(img1: atSindresorhusJimpLib.JimpNs.Jimp, img2: atSindresorhusJimpLib.JimpNs.Jimp): atSindresorhusJimpLib.Anon_Diff = js.native
  def diff(
    img1: atSindresorhusJimpLib.JimpNs.Jimp,
    img2: atSindresorhusJimpLib.JimpNs.Jimp,
    threshold: scala.Double
  ): atSindresorhusJimpLib.Anon_Diff = js.native
  def distance(img1: atSindresorhusJimpLib.JimpNs.Jimp, img2: atSindresorhusJimpLib.JimpNs.Jimp): scala.Double = js.native
  def intToRGBA(i: scala.Double): atSindresorhusJimpLib.JimpNs.RGBA = js.native
  def intToRGBA(
    i: scala.Double,
    cb: js.Function2[/* err */ stdLib.Error, /* rgba */ atSindresorhusJimpLib.JimpNs.RGBA, _]
  ): atSindresorhusJimpLib.JimpNs.RGBA = js.native
  def limit255(n: scala.Double): scala.Double = js.native
  def loadFont(file: java.lang.String): js.Promise[_] = js.native
  def loadFont(file: java.lang.String, cb: atSindresorhusJimpLib.JimpNs.ImageCallback): js.Promise[_] = js.native
  /* These are constructors, have already moved up, TODO: remove it in the future
    (path: string, cb?: Jimp.ImageCallback): void;
    (image: Jimp, cb?: Jimp.ImageCallback): void;
    (data: Buffer, cb?: Jimp.ImageCallback): void;
    (w: number, h: number, cb?: Jimp.ImageCallback): void;
    (w: number, h: number, background?: number, cb?: Jimp.ImageCallback): void;
    */
  def read(src: java.lang.String): js.Promise[atSindresorhusJimpLib.JimpNs.Jimp] = js.native
  def read(src: java.lang.String, cb: atSindresorhusJimpLib.JimpNs.ImageCallback): js.Promise[atSindresorhusJimpLib.JimpNs.Jimp] = js.native
  def read(src: nodeLib.Buffer): js.Promise[atSindresorhusJimpLib.JimpNs.Jimp] = js.native
  def read(src: nodeLib.Buffer, cb: atSindresorhusJimpLib.JimpNs.ImageCallback): js.Promise[atSindresorhusJimpLib.JimpNs.Jimp] = js.native
  def rgbaToInt(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): scala.Double = js.native
  def rgbaToInt(
    r: scala.Double,
    g: scala.Double,
    b: scala.Double,
    a: scala.Double,
    cb: js.Function2[/* err */ stdLib.Error, /* i */ scala.Double, _]
  ): scala.Double = js.native
}

