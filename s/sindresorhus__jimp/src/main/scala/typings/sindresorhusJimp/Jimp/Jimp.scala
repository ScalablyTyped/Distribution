package typings.sindresorhusJimp.Jimp

import typings.node.Buffer
import typings.sindresorhusJimp.anon.B
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jimp extends js.Object {
  var bitmap: Bitmap = js.native
  def autocrop(): this.type = js.native
  def autocrop(tolerance: Double): this.type = js.native
  def autocrop(tolerance: Double, cropOnlyFrames: Boolean): this.type = js.native
  def autocrop(tolerance: Double, cropOnlyFrames: Boolean, cb: ImageCallback): this.type = js.native
  def background(hex: Double): this.type = js.native
  def background(hex: Double, cb: ImageCallback): this.type = js.native
  def blit(src: typings.sindresorhusJimp.Jimp.Jimp, x: Double, y: Double): this.type = js.native
  def blit(src: typings.sindresorhusJimp.Jimp.Jimp, x: Double, y: Double, srcx: Double): this.type = js.native
  def blit(src: typings.sindresorhusJimp.Jimp.Jimp, x: Double, y: Double, srcx: Double, srcy: Double): this.type = js.native
  def blit(
    src: typings.sindresorhusJimp.Jimp.Jimp,
    x: Double,
    y: Double,
    srcx: Double,
    srcy: Double,
    srcw: Double
  ): this.type = js.native
  def blit(
    src: typings.sindresorhusJimp.Jimp.Jimp,
    x: Double,
    y: Double,
    srcx: Double,
    srcy: Double,
    srcw: Double,
    srch: Double
  ): this.type = js.native
  def blit(
    src: typings.sindresorhusJimp.Jimp.Jimp,
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
  def clone(cb: ImageCallback): typings.sindresorhusJimp.Jimp.Jimp = js.native
  def color(actions: js.Any): this.type = js.native
  def color(actions: js.Any, cb: ImageCallback): this.type = js.native
  def colour(actions: js.Any): this.type = js.native
  def colour(actions: js.Any, cb: ImageCallback): this.type = js.native
  def composite(src: typings.sindresorhusJimp.Jimp.Jimp, x: Double, y: Double): this.type = js.native
  def composite(src: typings.sindresorhusJimp.Jimp.Jimp, x: Double, y: Double, cb: ImageCallback): this.type = js.native
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
  def displace(map: typings.sindresorhusJimp.Jimp.Jimp, offset: Double): this.type = js.native
  def displace(map: typings.sindresorhusJimp.Jimp.Jimp, offset: Double, cb: ImageCallback): this.type = js.native
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
  def histogram(): B = js.native
  def inspect(): String = js.native
  def invert(): this.type = js.native
  def invert(cb: ImageCallback): this.type = js.native
  def mask(src: typings.sindresorhusJimp.Jimp.Jimp, x: Double, y: Double): this.type = js.native
  def mask(src: typings.sindresorhusJimp.Jimp.Jimp, x: Double, y: Double, cb: ImageCallback): this.type = js.native
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

