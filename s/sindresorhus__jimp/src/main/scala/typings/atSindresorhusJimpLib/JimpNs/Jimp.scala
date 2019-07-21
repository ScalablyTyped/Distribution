package typings
package atSindresorhusJimpLib.JimpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Jimp.Jimp")
@js.native
class Jimp protected () extends js.Object {
  def this(data: nodeLib.Buffer) = this()
  def this(image: Jimp) = this()
  def this(path: java.lang.String) = this()
  def this(data: nodeLib.Buffer, cb: ImageCallback) = this()
  def this(image: Jimp, cb: ImageCallback) = this()
  def this(path: java.lang.String, cb: ImageCallback) = this()
  def this(w: scala.Double, h: scala.Double) = this()
  def this(w: scala.Double, h: scala.Double, background: scala.Double) = this()
  def this(w: scala.Double, h: scala.Double, cb: ImageCallback) = this()
  def this(w: scala.Double, h: scala.Double, background: scala.Double, cb: ImageCallback) = this()
  var bitmap: Bitmap = js.native
  def autocrop(): this.type = js.native
  def autocrop(tolerance: scala.Double): this.type = js.native
  def autocrop(tolerance: scala.Double, cropOnlyFrames: scala.Boolean): this.type = js.native
  def autocrop(tolerance: scala.Double, cropOnlyFrames: scala.Boolean, cb: ImageCallback): this.type = js.native
  def background(hex: scala.Double): this.type = js.native
  def background(hex: scala.Double, cb: ImageCallback): this.type = js.native
  def blit(src: Jimp, x: scala.Double, y: scala.Double): this.type = js.native
  def blit(src: Jimp, x: scala.Double, y: scala.Double, srcx: scala.Double): this.type = js.native
  def blit(src: Jimp, x: scala.Double, y: scala.Double, srcx: scala.Double, srcy: scala.Double): this.type = js.native
  def blit(
    src: Jimp,
    x: scala.Double,
    y: scala.Double,
    srcx: scala.Double,
    srcy: scala.Double,
    srcw: scala.Double
  ): this.type = js.native
  def blit(
    src: Jimp,
    x: scala.Double,
    y: scala.Double,
    srcx: scala.Double,
    srcy: scala.Double,
    srcw: scala.Double,
    srch: scala.Double
  ): this.type = js.native
  def blit(
    src: Jimp,
    x: scala.Double,
    y: scala.Double,
    srcx: scala.Double,
    srcy: scala.Double,
    srcw: scala.Double,
    srch: scala.Double,
    cb: ImageCallback
  ): this.type = js.native
  def blur(r: scala.Double): this.type = js.native
  def blur(r: scala.Double, cb: ImageCallback): this.type = js.native
  def brightness(`val`: scala.Double): this.type = js.native
  def brightness(`val`: scala.Double, cb: ImageCallback): this.type = js.native
  def clone(cb: ImageCallback): Jimp = js.native
  def color(actions: js.Any): this.type = js.native
  def color(actions: js.Any, cb: ImageCallback): this.type = js.native
  def colour(actions: js.Any): this.type = js.native
  def colour(actions: js.Any, cb: ImageCallback): this.type = js.native
  def composite(src: Jimp, x: scala.Double, y: scala.Double): this.type = js.native
  def composite(src: Jimp, x: scala.Double, y: scala.Double, cb: ImageCallback): this.type = js.native
  def contain(w: scala.Double, h: scala.Double): this.type = js.native
  def contain(w: scala.Double, h: scala.Double, alignBits: scala.Double): this.type = js.native
  def contain(w: scala.Double, h: scala.Double, alignBits: scala.Double, mode: ImageCallback): this.type = js.native
  def contain(w: scala.Double, h: scala.Double, alignBits: scala.Double, mode: ImageCallback, cb: ImageCallback): this.type = js.native
  def contain(w: scala.Double, h: scala.Double, alignBits: scala.Double, mode: java.lang.String): this.type = js.native
  def contain(
    w: scala.Double,
    h: scala.Double,
    alignBits: scala.Double,
    mode: java.lang.String,
    cb: ImageCallback
  ): this.type = js.native
  def contrast(`val`: scala.Double): this.type = js.native
  def contrast(`val`: scala.Double, cb: ImageCallback): this.type = js.native
  def convolute(kernel: js.Any, x: ImageCallback): this.type = js.native
  def convolute(kernel: js.Any, x: ImageCallback, y: scala.Double): this.type = js.native
  def convolute(kernel: js.Any, x: ImageCallback, y: scala.Double, w: scala.Double): this.type = js.native
  def convolute(kernel: js.Any, x: ImageCallback, y: scala.Double, w: scala.Double, h: scala.Double): this.type = js.native
  def convolute(
    kernel: js.Any,
    x: ImageCallback,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    cb: ImageCallback
  ): this.type = js.native
  def convolute(kernel: js.Any, x: scala.Double): this.type = js.native
  def convolute(kernel: js.Any, x: scala.Double, y: scala.Double): this.type = js.native
  def convolute(kernel: js.Any, x: scala.Double, y: scala.Double, w: scala.Double): this.type = js.native
  def convolute(kernel: js.Any, x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): this.type = js.native
  def convolute(
    kernel: js.Any,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    cb: ImageCallback
  ): this.type = js.native
  def convolution(kernel: js.Any, edgeHandling: ImageCallback): this.type = js.native
  def convolution(kernel: js.Any, edgeHandling: ImageCallback, cb: ImageCallback): this.type = js.native
  def convolution(kernel: js.Any, edgeHandling: scala.Double): this.type = js.native
  def convolution(kernel: js.Any, edgeHandling: scala.Double, cb: ImageCallback): this.type = js.native
  def cover(w: scala.Double, h: scala.Double): this.type = js.native
  def cover(w: scala.Double, h: scala.Double, alignBits: scala.Double): this.type = js.native
  def cover(w: scala.Double, h: scala.Double, alignBits: scala.Double, mode: ImageCallback): this.type = js.native
  def cover(w: scala.Double, h: scala.Double, alignBits: scala.Double, mode: ImageCallback, cb: ImageCallback): this.type = js.native
  def cover(w: scala.Double, h: scala.Double, alignBits: scala.Double, mode: java.lang.String): this.type = js.native
  def cover(
    w: scala.Double,
    h: scala.Double,
    alignBits: scala.Double,
    mode: java.lang.String,
    cb: ImageCallback
  ): this.type = js.native
  def crop(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): this.type = js.native
  def crop(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, cb: ImageCallback): this.type = js.native
  def deflateLevel(l: scala.Double): this.type = js.native
  def deflateLevel(l: scala.Double, cb: ImageCallback): this.type = js.native
  def deflateStrategy(s: scala.Double): this.type = js.native
  def deflateStrategy(s: scala.Double, cb: ImageCallback): this.type = js.native
  def displace(map: Jimp, offset: scala.Double): this.type = js.native
  def displace(map: Jimp, offset: scala.Double, cb: ImageCallback): this.type = js.native
  def dither16(): this.type = js.native
  def dither16(cb: ImageCallback): this.type = js.native
  def dither565(): this.type = js.native
  def dither565(cb: ImageCallback): this.type = js.native
  def fade(f: js.Any): this.type = js.native
  def fade(f: js.Any, cb: js.Any): this.type = js.native
  def filterType(f: scala.Double): this.type = js.native
  def filterType(f: scala.Double, cb: ImageCallback): this.type = js.native
  def gaussian(r: scala.Double): this.type = js.native
  def gaussian(r: scala.Double, cb: ImageCallback): this.type = js.native
  def getBase64(mime: java.lang.String): this.type = js.native
  def getBase64(mime: java.lang.String, cb: js.Function2[/* err */ stdLib.Error, /* src */ java.lang.String, _]): this.type = js.native
  def getBuffer(mime: java.lang.String, cb: js.Function2[/* err */ stdLib.Error, /* buffer */ nodeLib.Buffer, _]): this.type = js.native
  def getExtension(): java.lang.String = js.native
  def getMIME(): java.lang.String = js.native
  def getPixelColor(x: scala.Double, y: scala.Double): scala.Double = js.native
  def getPixelColor(
    x: scala.Double,
    y: scala.Double,
    cb: js.Function2[/* err */ stdLib.Error, /* hex */ scala.Double, _]
  ): scala.Double = js.native
  def getPixelIndex(x: scala.Double, y: scala.Double): scala.Double = js.native
  def getPixelIndex(
    x: scala.Double,
    y: scala.Double,
    cb: js.Function2[/* err */ stdLib.Error, /* i */ scala.Double, _]
  ): scala.Double = js.native
  def grayscale(): this.type = js.native
  def grayscale(cb: ImageCallback): this.type = js.native
  def greyscale(): this.type = js.native
  def greyscale(cb: ImageCallback): this.type = js.native
  def hash(): java.lang.String = js.native
  def hash(base: scala.Double): java.lang.String = js.native
  def hash(base: scala.Double, cb: js.Function2[/* err */ stdLib.Error, /* hash */ java.lang.String, _]): java.lang.String = js.native
  def histogram(): atSindresorhusJimpLib.Anon_B = js.native
  def inspect(): java.lang.String = js.native
  def invert(): this.type = js.native
  def invert(cb: ImageCallback): this.type = js.native
  def mask(src: Jimp, x: scala.Double, y: scala.Double): this.type = js.native
  def mask(src: Jimp, x: scala.Double, y: scala.Double, cb: ImageCallback): this.type = js.native
  def mirror(horizontal: scala.Boolean, vertical: scala.Boolean): this.type = js.native
  def mirror(horizontal: scala.Boolean, vertical: scala.Boolean, cb: ImageCallback): this.type = js.native
  def normalize(): this.type = js.native
  def normalize(cb: ImageCallback): this.type = js.native
  def opacity(f: js.Any): this.type = js.native
  def opacity(f: js.Any, cb: js.Any): this.type = js.native
  def opaque(cb: js.Any): this.type = js.native
  def pixelate(size: scala.Double, x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): this.type = js.native
  def pixelate(
    size: scala.Double,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    cb: ImageCallback
  ): this.type = js.native
  def posterize(n: scala.Double): this.type = js.native
  def posterize(n: scala.Double, cb: ImageCallback): this.type = js.native
  def print(font: js.Any, x: scala.Double, y: scala.Double, text: java.lang.String): this.type = js.native
  def print(font: js.Any, x: scala.Double, y: scala.Double, text: java.lang.String, maxWidth: ImageCallback): this.type = js.native
  def print(
    font: js.Any,
    x: scala.Double,
    y: scala.Double,
    text: java.lang.String,
    maxWidth: ImageCallback,
    maxHeight: ImageCallback
  ): this.type = js.native
  def print(
    font: js.Any,
    x: scala.Double,
    y: scala.Double,
    text: java.lang.String,
    maxWidth: ImageCallback,
    maxHeight: ImageCallback,
    cb: ImageCallback
  ): this.type = js.native
  def print(
    font: js.Any,
    x: scala.Double,
    y: scala.Double,
    text: java.lang.String,
    maxWidth: ImageCallback,
    maxHeight: scala.Double
  ): this.type = js.native
  def print(
    font: js.Any,
    x: scala.Double,
    y: scala.Double,
    text: java.lang.String,
    maxWidth: ImageCallback,
    maxHeight: scala.Double,
    cb: ImageCallback
  ): this.type = js.native
  def print(font: js.Any, x: scala.Double, y: scala.Double, text: java.lang.String, maxWidth: scala.Double): this.type = js.native
  def print(
    font: js.Any,
    x: scala.Double,
    y: scala.Double,
    text: java.lang.String,
    maxWidth: scala.Double,
    maxHeight: ImageCallback
  ): this.type = js.native
  def print(
    font: js.Any,
    x: scala.Double,
    y: scala.Double,
    text: java.lang.String,
    maxWidth: scala.Double,
    maxHeight: ImageCallback,
    cb: ImageCallback
  ): this.type = js.native
  def print(
    font: js.Any,
    x: scala.Double,
    y: scala.Double,
    text: java.lang.String,
    maxWidth: scala.Double,
    maxHeight: scala.Double
  ): this.type = js.native
  def print(
    font: js.Any,
    x: scala.Double,
    y: scala.Double,
    text: java.lang.String,
    maxWidth: scala.Double,
    maxHeight: scala.Double,
    cb: ImageCallback
  ): this.type = js.native
  def quality(n: scala.Double): this.type = js.native
  def quality(n: scala.Double, cb: ImageCallback): this.type = js.native
  def resize(w: scala.Double, h: scala.Double): this.type = js.native
  def resize(w: scala.Double, h: scala.Double, mode: ImageCallback): this.type = js.native
  def resize(w: scala.Double, h: scala.Double, mode: ImageCallback, cb: ImageCallback): this.type = js.native
  def resize(w: scala.Double, h: scala.Double, mode: java.lang.String): this.type = js.native
  def resize(w: scala.Double, h: scala.Double, mode: java.lang.String, cb: ImageCallback): this.type = js.native
  def rgba(bool: scala.Boolean): this.type = js.native
  def rgba(bool: scala.Boolean, cb: ImageCallback): this.type = js.native
  def rotate(deg: scala.Double): this.type = js.native
  def rotate(deg: scala.Double, mode: scala.Boolean): this.type = js.native
  def rotate(deg: scala.Double, mode: scala.Boolean, cb: ImageCallback): this.type = js.native
  def rotate(deg: scala.Double, mode: scala.Double): this.type = js.native
  def rotate(deg: scala.Double, mode: scala.Double, cb: ImageCallback): this.type = js.native
  def scale(f: scala.Double): this.type = js.native
  def scale(f: scala.Double, mode: ImageCallback): this.type = js.native
  def scale(f: scala.Double, mode: ImageCallback, cb: ImageCallback): this.type = js.native
  def scale(f: scala.Double, mode: java.lang.String): this.type = js.native
  def scale(f: scala.Double, mode: java.lang.String, cb: ImageCallback): this.type = js.native
  def scaleToFit(w: scala.Double, h: scala.Double): this.type = js.native
  def scaleToFit(w: scala.Double, h: scala.Double, mode: js.Any): this.type = js.native
  def scaleToFit(w: scala.Double, h: scala.Double, mode: js.Any, cb: ImageCallback): this.type = js.native
  def scan(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    f: js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* idx */ scala.Double, _]
  ): this.type = js.native
  def scan(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    f: js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* idx */ scala.Double, _],
    cb: ImageCallback
  ): this.type = js.native
  def sepia(): this.type = js.native
  def sepia(cb: ImageCallback): this.type = js.native
  def setPixelColor(hex: scala.Double, x: scala.Double, y: scala.Double): this.type = js.native
  def setPixelColor(hex: scala.Double, x: scala.Double, y: scala.Double, cb: ImageCallback): this.type = js.native
  def write(path: java.lang.String): this.type = js.native
  def write(path: java.lang.String, cb: ImageCallback): this.type = js.native
}

/* static members */
@JSGlobal("Jimp.Jimp")
@js.native
object Jimp extends js.Object {
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

