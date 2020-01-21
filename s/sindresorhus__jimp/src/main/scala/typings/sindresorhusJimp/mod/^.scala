package typings.sindresorhusJimp.mod

import typings.node.Buffer
import typings.sindresorhusJimp.AnonDiff
import typings.sindresorhusJimp.Jimp.ImageCallback
import typings.sindresorhusJimp.Jimp.Jimp
import typings.sindresorhusJimp.Jimp.RGB
import typings.sindresorhusJimp.Jimp.RGBA
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jimp", JSImport.Namespace)
@js.native
class ^ protected () extends Jimp {
  def this(data: Buffer) = this()
  def this(image: Jimp) = this()
  def this(path: String) = this()
  def this(data: Buffer, cb: ImageCallback) = this()
  def this(image: Jimp, cb: ImageCallback) = this()
  def this(path: String, cb: ImageCallback) = this()
  def this(w: Double, h: Double) = this()
  def this(w: Double, h: Double, background: Double) = this()
  def this(w: Double, h: Double, cb: ImageCallback) = this()
  def this(w: Double, h: Double, background: Double, cb: ImageCallback) = this()
}

@JSImport("jimp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // used to auto resizing etc.
  var AUTO: Double = js.native
  var EDGE_CROP: Double = js.native
  // Edge Handling
  var EDGE_EXTEND: Double = js.native
  var EDGE_WRAP: Double = js.native
  var FONT_SANS_10_BLACK: String = js.native
  var FONT_SANS_128_BLACK: String = js.native
  var FONT_SANS_128_WHITE: String = js.native
  var FONT_SANS_12_BLACK: String = js.native
  var FONT_SANS_14_BLACK: String = js.native
  var FONT_SANS_16_BLACK: String = js.native
  var FONT_SANS_16_WHITE: String = js.native
  var FONT_SANS_32_BLACK: String = js.native
  var FONT_SANS_32_WHITE: String = js.native
  var FONT_SANS_64_BLACK: String = js.native
  var FONT_SANS_64_WHITE: String = js.native
  // Font locations
  var FONT_SANS_8_BLACK: String = js.native
  var FONT_SANS_8_WHITE: String = js.native
  var HORIZONTAL_ALIGN_CENTER: Double = js.native
  // Align modes for cover, contain, bit masks
  var HORIZONTAL_ALIGN_LEFT: Double = js.native
  var HORIZONTAL_ALIGN_RIGHT: Double = js.native
  var MIME_BMP: String = js.native
  var MIME_GIF: String = js.native
  var MIME_JGD: String = js.native
  var MIME_JPEG: String = js.native
  // supported mime types
  var MIME_PNG: String = js.native
  var MIME_X_MS_BMP: String = js.native
  // PNG filter types
  var PNG_FILTER_AUTO: Double = js.native
  var PNG_FILTER_AVERAGE: Double = js.native
  var PNG_FILTER_NONE: Double = js.native
  var PNG_FILTER_PAETH: Double = js.native
  var PNG_FILTER_SUB: Double = js.native
  var PNG_FILTER_UP: Double = js.native
  var RESIZE_BEZIER: String = js.native
  var RESIZE_BICUBIC: String = js.native
  var RESIZE_BILINEAR: String = js.native
  var RESIZE_HERMITE: String = js.native
  // resize methods
  var RESIZE_NEAREST_NEIGHBOR: String = js.native
  var VERTICAL_ALIGN_BOTTOM: Double = js.native
  var VERTICAL_ALIGN_MIDDLE: Double = js.native
  var VERTICAL_ALIGN_TOP: Double = js.native
  def colorDiff(rgba1: RGBA, rgba2: RGB): Double = js.native
  def colorDiff(rgba1: RGBA, rgba2: RGBA): Double = js.native
  def colorDiff(rgba1: RGB, rgba2: RGB): Double = js.native
  def colorDiff(rgba1: RGB, rgba2: RGBA): Double = js.native
  def diff(img1: Jimp, img2: Jimp): AnonDiff = js.native
  def diff(img1: Jimp, img2: Jimp, threshold: Double): AnonDiff = js.native
  def distance(img1: Jimp, img2: Jimp): Double = js.native
  def intToRGBA(i: Double): RGBA = js.native
  def intToRGBA(i: Double, cb: js.Function2[/* err */ Error, /* rgba */ RGBA, _]): RGBA = js.native
  def limit255(n: Double): Double = js.native
  def loadFont(file: String): js.Promise[_] = js.native
  def loadFont(file: String, cb: ImageCallback): js.Promise[_] = js.native
  /* These are constructors, have already moved up, TODO: remove it in the future
    (path: string, cb?: Jimp.ImageCallback): void;
    (image: Jimp, cb?: Jimp.ImageCallback): void;
    (data: Buffer, cb?: Jimp.ImageCallback): void;
    (w: number, h: number, cb?: Jimp.ImageCallback): void;
    (w: number, h: number, background?: number, cb?: Jimp.ImageCallback): void;
    */
  def read(src: String): js.Promise[Jimp] = js.native
  def read(src: String, cb: ImageCallback): js.Promise[Jimp] = js.native
  def read(src: Buffer): js.Promise[Jimp] = js.native
  def read(src: Buffer, cb: ImageCallback): js.Promise[Jimp] = js.native
  def rgbaToInt(r: Double, g: Double, b: Double, a: Double): Double = js.native
  def rgbaToInt(r: Double, g: Double, b: Double, a: Double, cb: js.Function2[/* err */ Error, /* i */ Double, _]): Double = js.native
}

