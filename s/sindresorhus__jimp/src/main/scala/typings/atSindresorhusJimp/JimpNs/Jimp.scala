package typings.atSindresorhusJimp.JimpNs

import typings.atSindresorhusJimp.Anon_B
import typings.atSindresorhusJimp.Anon_Diff
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Jimp.Jimp")
@js.native
class Jimp protected () extends js.Object {
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
  var bitmap: Bitmap = js.native
  def autocrop(): this.type = js.native
  def autocrop(tolerance: Double): this.type = js.native
  def autocrop(tolerance: Double, cropOnlyFrames: Boolean): this.type = js.native
  def autocrop(tolerance: Double, cropOnlyFrames: Boolean, cb: ImageCallback): this.type = js.native
  def background(hex: Double): this.type = js.native
  def background(hex: Double, cb: ImageCallback): this.type = js.native
  def blit(src: Jimp, x: Double, y: Double): this.type = js.native
  def blit(src: Jimp, x: Double, y: Double, srcx: Double): this.type = js.native
  def blit(src: Jimp, x: Double, y: Double, srcx: Double, srcy: Double): this.type = js.native
  def blit(src: Jimp, x: Double, y: Double, srcx: Double, srcy: Double, srcw: Double): this.type = js.native
  def blit(src: Jimp, x: Double, y: Double, srcx: Double, srcy: Double, srcw: Double, srch: Double): this.type = js.native
  def blit(
    src: Jimp,
    x: Double,
    y: Double,
    srcx: Double,
    srcy: Double,
    srcw: Double,
    srch: Double,
    cb: ImageCallback
  ): this.type = js.native
  def blur(r: Double): this.type = js.native
  def blur(r: Double, cb: ImageCallback): this.type = js.native
  def brightness(`val`: Double): this.type = js.native
  def brightness(`val`: Double, cb: ImageCallback): this.type = js.native
  def clone(cb: ImageCallback): Jimp = js.native
  def color(actions: js.Any): this.type = js.native
  def color(actions: js.Any, cb: ImageCallback): this.type = js.native
  def colour(actions: js.Any): this.type = js.native
  def colour(actions: js.Any, cb: ImageCallback): this.type = js.native
  def composite(src: Jimp, x: Double, y: Double): this.type = js.native
  def composite(src: Jimp, x: Double, y: Double, cb: ImageCallback): this.type = js.native
  def contain(w: Double, h: Double): this.type = js.native
  def contain(w: Double, h: Double, alignBits: Double): this.type = js.native
  def contain(w: Double, h: Double, alignBits: Double, mode: String): this.type = js.native
  def contain(w: Double, h: Double, alignBits: Double, mode: String, cb: ImageCallback): this.type = js.native
  def contain(w: Double, h: Double, alignBits: Double, mode: ImageCallback): this.type = js.native
  def contain(w: Double, h: Double, alignBits: Double, mode: ImageCallback, cb: ImageCallback): this.type = js.native
  def contrast(`val`: Double): this.type = js.native
  def contrast(`val`: Double, cb: ImageCallback): this.type = js.native
  def convolute(kernel: js.Any, x: Double): this.type = js.native
  def convolute(kernel: js.Any, x: Double, y: Double): this.type = js.native
  def convolute(kernel: js.Any, x: Double, y: Double, w: Double): this.type = js.native
  def convolute(kernel: js.Any, x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def convolute(kernel: js.Any, x: Double, y: Double, w: Double, h: Double, cb: ImageCallback): this.type = js.native
  def convolute(kernel: js.Any, x: ImageCallback): this.type = js.native
  def convolute(kernel: js.Any, x: ImageCallback, y: Double): this.type = js.native
  def convolute(kernel: js.Any, x: ImageCallback, y: Double, w: Double): this.type = js.native
  def convolute(kernel: js.Any, x: ImageCallback, y: Double, w: Double, h: Double): this.type = js.native
  def convolute(kernel: js.Any, x: ImageCallback, y: Double, w: Double, h: Double, cb: ImageCallback): this.type = js.native
  def convolution(kernel: js.Any, edgeHandling: Double): this.type = js.native
  def convolution(kernel: js.Any, edgeHandling: Double, cb: ImageCallback): this.type = js.native
  def convolution(kernel: js.Any, edgeHandling: ImageCallback): this.type = js.native
  def convolution(kernel: js.Any, edgeHandling: ImageCallback, cb: ImageCallback): this.type = js.native
  def cover(w: Double, h: Double): this.type = js.native
  def cover(w: Double, h: Double, alignBits: Double): this.type = js.native
  def cover(w: Double, h: Double, alignBits: Double, mode: String): this.type = js.native
  def cover(w: Double, h: Double, alignBits: Double, mode: String, cb: ImageCallback): this.type = js.native
  def cover(w: Double, h: Double, alignBits: Double, mode: ImageCallback): this.type = js.native
  def cover(w: Double, h: Double, alignBits: Double, mode: ImageCallback, cb: ImageCallback): this.type = js.native
  def crop(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def crop(x: Double, y: Double, w: Double, h: Double, cb: ImageCallback): this.type = js.native
  def deflateLevel(l: Double): this.type = js.native
  def deflateLevel(l: Double, cb: ImageCallback): this.type = js.native
  def deflateStrategy(s: Double): this.type = js.native
  def deflateStrategy(s: Double, cb: ImageCallback): this.type = js.native
  def displace(map: Jimp, offset: Double): this.type = js.native
  def displace(map: Jimp, offset: Double, cb: ImageCallback): this.type = js.native
  def dither16(): this.type = js.native
  def dither16(cb: ImageCallback): this.type = js.native
  def dither565(): this.type = js.native
  def dither565(cb: ImageCallback): this.type = js.native
  def fade(f: js.Any): this.type = js.native
  def fade(f: js.Any, cb: js.Any): this.type = js.native
  def filterType(f: Double): this.type = js.native
  def filterType(f: Double, cb: ImageCallback): this.type = js.native
  def gaussian(r: Double): this.type = js.native
  def gaussian(r: Double, cb: ImageCallback): this.type = js.native
  def getBase64(mime: String): this.type = js.native
  def getBase64(mime: String, cb: js.Function2[/* err */ Error, /* src */ String, _]): this.type = js.native
  def getBuffer(mime: String, cb: js.Function2[/* err */ Error, /* buffer */ Buffer, _]): this.type = js.native
  def getExtension(): String = js.native
  def getMIME(): String = js.native
  def getPixelColor(x: Double, y: Double): Double = js.native
  def getPixelColor(x: Double, y: Double, cb: js.Function2[/* err */ Error, /* hex */ Double, _]): Double = js.native
  def getPixelIndex(x: Double, y: Double): Double = js.native
  def getPixelIndex(x: Double, y: Double, cb: js.Function2[/* err */ Error, /* i */ Double, _]): Double = js.native
  def grayscale(): this.type = js.native
  def grayscale(cb: ImageCallback): this.type = js.native
  def greyscale(): this.type = js.native
  def greyscale(cb: ImageCallback): this.type = js.native
  def hash(): String = js.native
  def hash(base: Double): String = js.native
  def hash(base: Double, cb: js.Function2[/* err */ Error, /* hash */ String, _]): String = js.native
  def histogram(): Anon_B = js.native
  def inspect(): String = js.native
  def invert(): this.type = js.native
  def invert(cb: ImageCallback): this.type = js.native
  def mask(src: Jimp, x: Double, y: Double): this.type = js.native
  def mask(src: Jimp, x: Double, y: Double, cb: ImageCallback): this.type = js.native
  def mirror(horizontal: Boolean, vertical: Boolean): this.type = js.native
  def mirror(horizontal: Boolean, vertical: Boolean, cb: ImageCallback): this.type = js.native
  def normalize(): this.type = js.native
  def normalize(cb: ImageCallback): this.type = js.native
  def opacity(f: js.Any): this.type = js.native
  def opacity(f: js.Any, cb: js.Any): this.type = js.native
  def opaque(cb: js.Any): this.type = js.native
  def pixelate(size: Double, x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def pixelate(size: Double, x: Double, y: Double, w: Double, h: Double, cb: ImageCallback): this.type = js.native
  def posterize(n: Double): this.type = js.native
  def posterize(n: Double, cb: ImageCallback): this.type = js.native
  def print(font: js.Any, x: Double, y: Double, text: String): this.type = js.native
  def print(font: js.Any, x: Double, y: Double, text: String, maxWidth: Double): this.type = js.native
  def print(font: js.Any, x: Double, y: Double, text: String, maxWidth: Double, maxHeight: Double): this.type = js.native
  def print(
    font: js.Any,
    x: Double,
    y: Double,
    text: String,
    maxWidth: Double,
    maxHeight: Double,
    cb: ImageCallback
  ): this.type = js.native
  def print(font: js.Any, x: Double, y: Double, text: String, maxWidth: Double, maxHeight: ImageCallback): this.type = js.native
  def print(
    font: js.Any,
    x: Double,
    y: Double,
    text: String,
    maxWidth: Double,
    maxHeight: ImageCallback,
    cb: ImageCallback
  ): this.type = js.native
  def print(font: js.Any, x: Double, y: Double, text: String, maxWidth: ImageCallback): this.type = js.native
  def print(font: js.Any, x: Double, y: Double, text: String, maxWidth: ImageCallback, maxHeight: Double): this.type = js.native
  def print(
    font: js.Any,
    x: Double,
    y: Double,
    text: String,
    maxWidth: ImageCallback,
    maxHeight: Double,
    cb: ImageCallback
  ): this.type = js.native
  def print(
    font: js.Any,
    x: Double,
    y: Double,
    text: String,
    maxWidth: ImageCallback,
    maxHeight: ImageCallback
  ): this.type = js.native
  def print(
    font: js.Any,
    x: Double,
    y: Double,
    text: String,
    maxWidth: ImageCallback,
    maxHeight: ImageCallback,
    cb: ImageCallback
  ): this.type = js.native
  def quality(n: Double): this.type = js.native
  def quality(n: Double, cb: ImageCallback): this.type = js.native
  def resize(w: Double, h: Double): this.type = js.native
  def resize(w: Double, h: Double, mode: String): this.type = js.native
  def resize(w: Double, h: Double, mode: String, cb: ImageCallback): this.type = js.native
  def resize(w: Double, h: Double, mode: ImageCallback): this.type = js.native
  def resize(w: Double, h: Double, mode: ImageCallback, cb: ImageCallback): this.type = js.native
  def rgba(bool: Boolean): this.type = js.native
  def rgba(bool: Boolean, cb: ImageCallback): this.type = js.native
  def rotate(deg: Double): this.type = js.native
  def rotate(deg: Double, mode: Boolean): this.type = js.native
  def rotate(deg: Double, mode: Boolean, cb: ImageCallback): this.type = js.native
  def rotate(deg: Double, mode: Double): this.type = js.native
  def rotate(deg: Double, mode: Double, cb: ImageCallback): this.type = js.native
  def scale(f: Double): this.type = js.native
  def scale(f: Double, mode: String): this.type = js.native
  def scale(f: Double, mode: String, cb: ImageCallback): this.type = js.native
  def scale(f: Double, mode: ImageCallback): this.type = js.native
  def scale(f: Double, mode: ImageCallback, cb: ImageCallback): this.type = js.native
  def scaleToFit(w: Double, h: Double): this.type = js.native
  def scaleToFit(w: Double, h: Double, mode: js.Any): this.type = js.native
  def scaleToFit(w: Double, h: Double, mode: js.Any, cb: ImageCallback): this.type = js.native
  def scan(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    f: js.Function3[/* x */ Double, /* y */ Double, /* idx */ Double, _]
  ): this.type = js.native
  def scan(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    f: js.Function3[/* x */ Double, /* y */ Double, /* idx */ Double, _],
    cb: ImageCallback
  ): this.type = js.native
  def sepia(): this.type = js.native
  def sepia(cb: ImageCallback): this.type = js.native
  def setPixelColor(hex: Double, x: Double, y: Double): this.type = js.native
  def setPixelColor(hex: Double, x: Double, y: Double, cb: ImageCallback): this.type = js.native
  def write(path: String): this.type = js.native
  def write(path: String, cb: ImageCallback): this.type = js.native
}

/* static members */
@JSGlobal("Jimp.Jimp")
@js.native
object Jimp extends js.Object {
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
  def diff(img1: Jimp, img2: Jimp): Anon_Diff = js.native
  def diff(img1: Jimp, img2: Jimp, threshold: Double): Anon_Diff = js.native
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

