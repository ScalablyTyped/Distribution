package typings.sharp.mod

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Duplex
import typings.sharp.anon.Brightness
import typings.sharp.anon.Data
import typings.sharp.anon.ResolveWithObject
import typings.sharp.sharpInts.`0`
import typings.sharp.sharpInts.`1`
import typings.sharp.sharpInts.`2`
import typings.sharp.sharpInts.`3`
import typings.sharp.sharpStrings.alpha
import typings.sharp.sharpStrings.and
import typings.sharp.sharpStrings.avif
import typings.sharp.sharpStrings.blue
import typings.sharp.sharpStrings.dz
import typings.sharp.sharpStrings.eor
import typings.sharp.sharpStrings.fits
import typings.sharp.sharpStrings.gif
import typings.sharp.sharpStrings.green
import typings.sharp.sharpStrings.heif
import typings.sharp.sharpStrings.input
import typings.sharp.sharpStrings.jp2
import typings.sharp.sharpStrings.jpeg
import typings.sharp.sharpStrings.jpg
import typings.sharp.sharpStrings.jxl
import typings.sharp.sharpStrings.magick
import typings.sharp.sharpStrings.openslide
import typings.sharp.sharpStrings.or
import typings.sharp.sharpStrings.pdf
import typings.sharp.sharpStrings.png
import typings.sharp.sharpStrings.ppm
import typings.sharp.sharpStrings.raw
import typings.sharp.sharpStrings.red
import typings.sharp.sharpStrings.svg
import typings.sharp.sharpStrings.tif
import typings.sharp.sharpStrings.tiff
import typings.sharp.sharpStrings.v
import typings.sharp.sharpStrings.webp
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sharp extends Duplex {
  
  /**
    * Perform an affine transform on an image. This operation will always occur after resizing, extraction and rotation, if any.
    * You must provide an array of length 4 or a 2x2 affine transformation matrix.
    * By default, new pixels are filled with a black background. You can provide a background color with the `background` option.
    * A particular interpolator may also be specified. Set the `interpolator` option to an attribute of the `sharp.interpolators` Object e.g. `sharp.interpolators.nohalo`.
    *
    * In the case of a 2x2 matrix, the transform is:
    * X = matrix[0, 0] * (x + idx) + matrix[0, 1] * (y + idy) + odx
    * Y = matrix[1, 0] * (x + idx) + matrix[1, 1] * (y + idy) + ody
    *
    * where:
    *
    * x and y are the coordinates in input image.
    * X and Y are the coordinates in output image.
    * (0,0) is the upper left corner.
    *
    * @param matrix Affine transformation matrix, may either by a array of length four or a 2x2 matrix array
    * @param options if present, is an Object with optional attributes.
    *
    * @returns A sharp instance that can be used to chain operations
    */
  def affine(matrix: js.Tuple4[Double, Double, Double, Double]): Sharp = js.native
  def affine(matrix: js.Tuple4[Double, Double, Double, Double], options: AffineOptions): Sharp = js.native
  def affine(matrix: Matrix2x2): Sharp = js.native
  def affine(matrix: Matrix2x2, options: AffineOptions): Sharp = js.native
  
  /**
    * Use these AVIF options for output image.
    * Whilst it is possible to create AVIF images smaller than 16x16 pixels, most web browsers do not display these properly.
    * @param options Output options.
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def avif(): Sharp = js.native
  def avif(options: AvifOptions): Sharp = js.native
  
  /**
    * Perform a bitwise boolean operation on all input image channels (bands) to produce a single channel output image.
    * @param boolOp one of "and", "or" or "eor" to perform that bitwise operation, like the C logic operators &, | and ^ respectively.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def bandbool(boolOp: and | or | eor): Sharp = js.native
  
  /**
    * Blur the image.
    * When used without parameters, performs a fast, mild blur of the output image.
    * When a sigma is provided, performs a slower, more accurate Gaussian blur.
    * When a boolean sigma is provided, ether blur mild or disable blur
    * @param sigma a value between 0.3 and 1000 representing the sigma of the Gaussian mask, where sigma = 1 + radius / 2.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def blur(): Sharp = js.native
  def blur(sigma: Boolean): Sharp = js.native
  def blur(sigma: Double): Sharp = js.native
  
  /**
    * Perform a bitwise boolean operation with operand image.
    * This operation creates an output image where each pixel is the result of the selected bitwise boolean operation between the corresponding pixels of the input images.
    * @param operand Buffer containing image data or String containing the path to an image file.
    * @param operator one of "and", "or" or "eor" to perform that bitwise operation, like the C logic operators &, | and ^ respectively.
    * @param options describes operand when using raw pixel data.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def boolean(operand: String, operator: and | or | eor): Sharp = js.native
  def boolean(operand: String, operator: and | or | eor, options: typings.sharp.anon.Raw): Sharp = js.native
  def boolean(operand: Buffer, operator: and | or | eor): Sharp = js.native
  def boolean(operand: Buffer, operator: and | or | eor, options: typings.sharp.anon.Raw): Sharp = js.native
  
  /**
    * Perform contrast limiting adaptive histogram equalization (CLAHE)
    *
    * This will, in general, enhance the clarity of the image by bringing out
    * darker details. Please read more about CLAHE here:
    * https://en.wikipedia.org/wiki/Adaptive_histogram_equalization#Contrast_Limited_AHE
    *
    * @param options clahe options
    */
  def clahe(options: ClaheOptions): Sharp = js.native
  
  //#endregion
  //#region Composite functions
  /**
    * Composite image(s) over the processed (resized, extracted etc.) image.
    *
    * The images to composite must be the same size or smaller than the processed image.
    * If both `top` and `left` options are provided, they take precedence over `gravity`.
    * @param images - Ordered list of images to composite
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def composite(images: js.Array[OverlayOptions]): Sharp = js.native
  
  /**
    * Convolve the image with the specified kernel.
    * @param kernel the specified kernel
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def convolve(kernel: Kernel_): Sharp = js.native
  
  /**
    * Ensure alpha channel, if missing. The added alpha channel will be fully opaque. This is a no-op if the image already has an alpha channel.
    * @param alpha transparency level (0=fully-transparent, 1=fully-opaque) (optional, default 1).
    * @returns A sharp instance that can be used to chain operations
    */
  def ensureAlpha(): Sharp = js.native
  def ensureAlpha(alpha: Double): Sharp = js.native
  
  /**
    * Extend / pad / extrude one or more edges of the image with either
    * the provided background colour or pixels derived from the image.
    * This operation will always occur after resizing and extraction, if any.
    * @param extend single pixel count to add to all edges or an Object with per-edge counts
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def extend(extend: Double): Sharp = js.native
  def extend(extend: ExtendOptions): Sharp = js.native
  
  /**
    * Extract a region of the image.
    *  - Use extract() before resize() for pre-resize extraction.
    *  - Use extract() after resize() for post-resize extraction.
    *  - Use extract() before and after for both.
    *
    * @param region The region to extract
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def extract(region: Region): Sharp = js.native
  
  /**
    * Extract a single channel from a multi-channel image.
    * @param channel zero-indexed channel/band number to extract, or red, green, blue or alpha.
    * @throws {Error} Invalid channel
    * @returns A sharp instance that can be used to chain operations
    */
  def extractChannel(channel: `0` | `1` | `2` | `3` | red | green | blue | alpha): Sharp = js.native
  
  /**
    * Merge alpha transparency channel, if any, with background.
    * @param flatten true to enable and false to disable (defaults to true)
    * @returns A sharp instance that can be used to chain operations
    */
  def flatten(): Sharp = js.native
  def flatten(flatten: Boolean): Sharp = js.native
  def flatten(flatten: FlattenOptions): Sharp = js.native
  
  /**
    * Flip the image about the vertical Y axis. This always occurs after rotation, if any.
    * The use of flip implies the removal of the EXIF Orientation tag, if any.
    * @param flip true to enable and false to disable (defaults to true)
    * @returns A sharp instance that can be used to chain operations
    */
  def flip(): Sharp = js.native
  def flip(flip: Boolean): Sharp = js.native
  
  /**
    * Flop the image about the horizontal X axis. This always occurs after rotation, if any.
    * The use of flop implies the removal of the EXIF Orientation tag, if any.
    * @param flop true to enable and false to disable (defaults to true)
    * @returns A sharp instance that can be used to chain operations
    */
  def flop(): Sharp = js.native
  def flop(flop: Boolean): Sharp = js.native
  
  /**
    * Apply a gamma correction by reducing the encoding (darken) pre-resize at a factor of 1/gamma then increasing the encoding (brighten) post-resize at a factor of gamma.
    * This can improve the perceived brightness of a resized image in non-linear colour spaces.
    * JPEG and WebP input images will not take advantage of the shrink-on-load performance optimisation when applying a gamma correction.
    * Supply a second argument to use a different output gamma value, otherwise the first value is used in both cases.
    * @param gamma value between 1.0 and 3.0. (optional, default 2.2)
    * @param gammaOut value between 1.0 and 3.0. (optional, defaults to same as gamma)
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def gamma(): Sharp = js.native
  def gamma(gamma: Double): Sharp = js.native
  def gamma(gamma: Double, gammaOut: Double): Sharp = js.native
  def gamma(gamma: Unit, gammaOut: Double): Sharp = js.native
  
  /**
    * Use these GIF options for output image.
    * Requires libvips compiled with support for ImageMagick or GraphicsMagick. The prebuilt binaries do not include this - see installing a custom libvips.
    * @param options Output options.
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def gif(): Sharp = js.native
  def gif(options: GifOptions): Sharp = js.native
  
  /**
    * Alternative spelling of greyscale().
    * @param grayscale true to enable and false to disable (defaults to true)
    * @returns A sharp instance that can be used to chain operations
    */
  def grayscale(): Sharp = js.native
  def grayscale(grayscale: Boolean): Sharp = js.native
  
  /**
    * Convert to 8-bit greyscale; 256 shades of grey.
    * This is a linear operation.
    * If the input image is in a non-linear colour space such as sRGB, use gamma() with greyscale() for the best results.
    * By default the output image will be web-friendly sRGB and contain three (identical) color channels.
    * This may be overridden by other sharp operations such as toColourspace('b-w'), which will produce an output image containing one color channel.
    * An alpha channel may be present, and will be unchanged by the operation.
    * @param greyscale true to enable and false to disable (defaults to true)
    * @returns A sharp instance that can be used to chain operations
    */
  def greyscale(): Sharp = js.native
  def greyscale(greyscale: Boolean): Sharp = js.native
  
  /**
    * Use these HEIF options for output image.
    * Support for patent-encumbered HEIC images requires the use of a globally-installed libvips compiled with support for libheif, libde265 and x265.
    * @param options Output options.
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def heif(): Sharp = js.native
  def heif(options: HeifOptions): Sharp = js.native
  
  /**
    * Join one or more channels to the image. The meaning of the added channels depends on the output colourspace, set with toColourspace().
    * By default the output image will be web-friendly sRGB, with additional channels interpreted as alpha channels. Channel ordering follows vips convention:
    *  - sRGB: 0: Red, 1: Green, 2: Blue, 3: Alpha.
    *  - CMYK: 0: Magenta, 1: Cyan, 2: Yellow, 3: Black, 4: Alpha.
    *
    * Buffers may be any of the image formats supported by sharp.
    * For raw pixel input, the options object should contain a raw attribute, which follows the format of the attribute of the same name in the sharp() constructor.
    * @param images one or more images (file paths, Buffers).
    * @param options image options, see sharp() constructor.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def joinChannel(images: String): Sharp = js.native
  def joinChannel(images: String, options: SharpOptions): Sharp = js.native
  def joinChannel(images: Buffer): Sharp = js.native
  def joinChannel(images: Buffer, options: SharpOptions): Sharp = js.native
  def joinChannel(images: ArrayLike[String | Buffer]): Sharp = js.native
  def joinChannel(images: ArrayLike[String | Buffer], options: SharpOptions): Sharp = js.native
  
  /**
    * Use these JP2 (JPEG 2000) options for output image.
    * @param options Output options.
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def jp2(): Sharp = js.native
  def jp2(options: Jp2Options): Sharp = js.native
  
  /**
    * Use these JPEG options for output image.
    * @param options Output options.
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def jpeg(): Sharp = js.native
  def jpeg(options: JpegOptions): Sharp = js.native
  
  /**
    * Use these JPEG-XL (JXL) options for output image.
    * This feature is experimental, please do not use in production systems.
    * Requires libvips compiled with support for libjxl.
    * The prebuilt binaries do not include this.
    * Image metadata (EXIF, XMP) is unsupported.
    * @param options Output options.
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def jxl(): Sharp = js.native
  def jxl(options: JxlOptions): Sharp = js.native
  
  /**
    * Apply the linear formula a * input + b to the image (levels adjustment)
    * @param a multiplier (optional, default 1.0)
    * @param b offset (optional, default 0.0)
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def linear(): Sharp = js.native
  def linear(a: js.Array[Double]): Sharp = js.native
  def linear(a: js.Array[Double], b: js.Array[Double]): Sharp = js.native
  def linear(a: js.Array[Double], b: Double): Sharp = js.native
  def linear(a: Double): Sharp = js.native
  def linear(a: Double, b: js.Array[Double]): Sharp = js.native
  def linear(a: Double, b: Double): Sharp = js.native
  def linear(a: Null, b: js.Array[Double]): Sharp = js.native
  def linear(a: Null, b: Double): Sharp = js.native
  def linear(a: Unit, b: js.Array[Double]): Sharp = js.native
  def linear(a: Unit, b: Double): Sharp = js.native
  
  /**
    * Apply median filter. When used without parameters the default window is 3x3.
    * @param size square mask size: size x size (optional, default 3)
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def median(): Sharp = js.native
  def median(size: Double): Sharp = js.native
  
  /**
    * Fast access to (uncached) image metadata without decoding any compressed image data.
    * @returns A promise that resolves with a metadata object
    */
  def metadata(): js.Promise[Metadata] = js.native
  /**
    * Fast access to (uncached) image metadata without decoding any compressed image data.
    * @returns A sharp instance that can be used to chain operations
    */
  def metadata(callback: js.Function2[/* err */ js.Error, /* metadata */ Metadata, Unit]): Sharp = js.native
  
  /**
    * Transforms the image using brightness, saturation, hue rotation and lightness.
    * Brightness and lightness both operate on luminance, with the difference being that brightness is multiplicative whereas lightness is additive.
    * @param options describes the modulation
    * @returns A sharp instance that can be used to chain operations
    */
  def modulate(): Sharp = js.native
  def modulate(options: Brightness): Sharp = js.native
  
  /**
    * Produce the "negative" of the image.
    * @param negate true to enable and false to disable, or an object of options (defaults to true)
    * @returns A sharp instance that can be used to chain operations
    */
  def negate(): Sharp = js.native
  def negate(negate: Boolean): Sharp = js.native
  def negate(negate: NegateOptions): Sharp = js.native
  
  /**
    * Enhance output image contrast by stretching its luminance to cover a full dynamic range.
    *
    * Uses a histogram-based approach, taking a default range of 1% to 99% to reduce sensitivity to noise at the extremes.
    *
    * Luminance values below the `lower` percentile will be underexposed by clipping to zero.
    * Luminance values above the `upper` percentile will be overexposed by clipping to the max pixel value.
    *
    * @param normalise options
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def normalise(): Sharp = js.native
  def normalise(normalise: NormaliseOptions): Sharp = js.native
  
  /**
    * Alternative spelling of normalise.
    * @param normalize options
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def normalize(): Sharp = js.native
  def normalize(normalize: NormaliseOptions): Sharp = js.native
  
  /**
    * Alternative spelling of pipelineColourspace
    * @param colorspace pipeline colourspace e.g. rgb16, scrgb, lab, grey16 ...
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def pipelineColorspace(): Sharp = js.native
  def pipelineColorspace(colorspace: String): Sharp = js.native
  
  /**
    * Set the pipeline colourspace.
    * The input image will be converted to the provided colourspace at the start of the pipeline.
    * All operations will use this colourspace before converting to the output colourspace, as defined by toColourspace.
    * This feature is experimental and has not yet been fully-tested with all operations.
    *
    * @param colourspace pipeline colourspace e.g. rgb16, scrgb, lab, grey16 ...
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def pipelineColourspace(): Sharp = js.native
  def pipelineColourspace(colourspace: String): Sharp = js.native
  
  /**
    * Use these PNG options for output image.
    * PNG output is always full colour at 8 or 16 bits per pixel.
    * Indexed PNG input at 1, 2 or 4 bits per pixel is converted to 8 bits per pixel.
    * @param options Output options.
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def png(): Sharp = js.native
  def png(options: PngOptions): Sharp = js.native
  
  /**
    * Force output to be raw, uncompressed uint8 pixel data.
    * @param options Raw output options.
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def raw(): Sharp = js.native
  def raw(options: RawOptions): Sharp = js.native
  
  /**
    * Recomb the image with the specified matrix.
    * @param inputMatrix 3x3 Recombination matrix
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def recomb(inputMatrix: Matrix3x3): Sharp = js.native
  
  //#region Channel functions
  /**
    * Remove alpha channel, if any. This is a no-op if the image does not have an alpha channel.
    * @returns A sharp instance that can be used to chain operations
    */
  def removeAlpha(): Sharp = js.native
  
  //#endregion
  //#region Resize functions
  /**
    * Resize image to width, height or width x height.
    *
    * When both a width and height are provided, the possible methods by which the image should fit these are:
    *  - cover: Crop to cover both provided dimensions (the default).
    *  - contain: Embed within both provided dimensions.
    *  - fill: Ignore the aspect ratio of the input and stretch to both provided dimensions.
    *  - inside: Preserving aspect ratio, resize the image to be as large as possible while ensuring its dimensions are less than or equal to both those specified.
    *  - outside: Preserving aspect ratio, resize the image to be as small as possible while ensuring its dimensions are greater than or equal to both those specified.
    *             Some of these values are based on the object-fit CSS property.
    *
    * When using a fit of cover or contain, the default position is centre. Other options are:
    *  - sharp.position: top, right top, right, right bottom, bottom, left bottom, left, left top.
    *  - sharp.gravity: north, northeast, east, southeast, south, southwest, west, northwest, center or centre.
    *  - sharp.strategy: cover only, dynamically crop using either the entropy or attention strategy. Some of these values are based on the object-position CSS property.
    *
    * The experimental strategy-based approach resizes so one dimension is at its target length then repeatedly ranks edge regions,
    * discarding the edge with the lowest score based on the selected strategy.
    *  - entropy: focus on the region with the highest Shannon entropy.
    *  - attention: focus on the region with the highest luminance frequency, colour saturation and presence of skin tones.
    *
    * Possible interpolation kernels are:
    *  - nearest: Use nearest neighbour interpolation.
    *  - cubic: Use a Catmull-Rom spline.
    *  - lanczos2: Use a Lanczos kernel with a=2.
    *  - lanczos3: Use a Lanczos kernel with a=3 (the default).
    *
    * @param width pixels wide the resultant image should be. Use null or undefined to auto-scale the width to match the height.
    * @param height pixels high the resultant image should be. Use null or undefined to auto-scale the height to match the width.
    * @param options resize options
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def resize(): Sharp = js.native
  def resize(widthOrOptions: Double): Sharp = js.native
  def resize(widthOrOptions: Double, height: Double): Sharp = js.native
  def resize(widthOrOptions: Double, height: Double, options: ResizeOptions): Sharp = js.native
  def resize(widthOrOptions: Double, height: Null, options: ResizeOptions): Sharp = js.native
  def resize(widthOrOptions: Double, height: Unit, options: ResizeOptions): Sharp = js.native
  def resize(widthOrOptions: Null, height: Double): Sharp = js.native
  def resize(widthOrOptions: Null, height: Double, options: ResizeOptions): Sharp = js.native
  def resize(widthOrOptions: Null, height: Null, options: ResizeOptions): Sharp = js.native
  def resize(widthOrOptions: Null, height: Unit, options: ResizeOptions): Sharp = js.native
  def resize(widthOrOptions: Unit, height: Double): Sharp = js.native
  def resize(widthOrOptions: Unit, height: Double, options: ResizeOptions): Sharp = js.native
  def resize(widthOrOptions: Unit, height: Null, options: ResizeOptions): Sharp = js.native
  def resize(widthOrOptions: Unit, height: Unit, options: ResizeOptions): Sharp = js.native
  /**
    * Shorthand for resize(null, null, options);
    *
    * @param options resize options
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def resize(widthOrOptions: ResizeOptions): Sharp = js.native
  def resize(widthOrOptions: ResizeOptions, height: Double): Sharp = js.native
  def resize(widthOrOptions: ResizeOptions, height: Double, options: ResizeOptions): Sharp = js.native
  def resize(widthOrOptions: ResizeOptions, height: Null, options: ResizeOptions): Sharp = js.native
  def resize(widthOrOptions: ResizeOptions, height: Unit, options: ResizeOptions): Sharp = js.native
  
  //#endregion
  //#region Operation functions
  /**
    * Rotate the output image by either an explicit angle or auto-orient based on the EXIF Orientation tag.
    *
    * If an angle is provided, it is converted to a valid positive degree rotation. For example, -450 will produce a 270deg rotation.
    *
    * When rotating by an angle other than a multiple of 90, the background colour can be provided with the background option.
    *
    * If no angle is provided, it is determined from the EXIF data. Mirroring is supported and may infer the use of a flip operation.
    *
    * The use of rotate implies the removal of the EXIF Orientation tag, if any.
    *
    * Method order is important when both rotating and extracting regions, for example rotate(x).extract(y) will produce a different result to extract(y).rotate(x).
    * @param angle angle of rotation. (optional, default auto)
    * @param options if present, is an Object with optional attributes.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def rotate(): Sharp = js.native
  def rotate(angle: Double): Sharp = js.native
  def rotate(angle: Double, options: RotateOptions): Sharp = js.native
  def rotate(angle: Unit, options: RotateOptions): Sharp = js.native
  
  /**
    * Sharpen the image.
    * When used without parameters, performs a fast, mild sharpen of the output image.
    * When a sigma is provided, performs a slower, more accurate sharpen of the L channel in the LAB colour space.
    * Fine-grained control over the level of sharpening in "flat" (m1) and "jagged" (m2) areas is available.
    * @param options if present, is an Object with optional attributes
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def sharpen(): Sharp = js.native
  def sharpen(options: SharpenOptions): Sharp = js.native
  def sharpen(sigma: Double): Sharp = js.native
  def sharpen(sigma: Double, flat: Double): Sharp = js.native
  def sharpen(sigma: Double, flat: Double, jagged: Double): Sharp = js.native
  def sharpen(sigma: Double, flat: Unit, jagged: Double): Sharp = js.native
  def sharpen(sigma: Unit, flat: Double): Sharp = js.native
  def sharpen(sigma: Unit, flat: Double, jagged: Double): Sharp = js.native
  def sharpen(sigma: Unit, flat: Unit, jagged: Double): Sharp = js.native
  
  /**
    * Access to pixel-derived image statistics for every channel in the image.
    * @returns A promise that resolves with a stats object
    */
  def stats(): js.Promise[Stats] = js.native
  /**
    * Access to pixel-derived image statistics for every channel in the image.
    * @returns A sharp instance that can be used to chain operations
    */
  def stats(callback: js.Function2[/* err */ js.Error, /* stats */ Stats, Unit]): Sharp = js.native
  
  /**
    * Any pixel value greather than or equal to the threshold value will be set to 255, otherwise it will be set to 0.
    * @param threshold a value in the range 0-255 representing the level at which the threshold will be applied. (optional, default 128)
    * @param options threshold options
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def threshold(): Sharp = js.native
  def threshold(threshold: Double): Sharp = js.native
  def threshold(threshold: Double, options: ThresholdOptions): Sharp = js.native
  def threshold(threshold: Unit, options: ThresholdOptions): Sharp = js.native
  
  /**
    * Use these TIFF options for output image.
    * @param options Output options.
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def tiff(): Sharp = js.native
  def tiff(options: TiffOptions): Sharp = js.native
  
  /**
    * Use tile-based deep zoom (image pyramid) output.
    * Set the format and options for tile images via the toFormat, jpeg, png or webp functions.
    * Use a .zip or .szi file extension with toFile to write to a compressed archive file format.
    *
    * Warning: multiple sharp instances concurrently producing tile output can expose a possible race condition in some versions of libgsf.
    * @param tile tile options
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def tile(): Sharp = js.native
  def tile(tile: TileOptions): Sharp = js.native
  
  /**
    * Set a timeout for processing, in seconds. Use a value of zero to continue processing indefinitely, the default behaviour.
    * The clock starts when libvips opens an input image for processing. Time spent waiting for a libuv thread to become available is not included.
    * @param options Object with a `seconds` attribute between 0 and 3600 (number)
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def timeout(options: TimeoutOptions): Sharp = js.native
  
  //#endregion
  //#region Color functions
  /**
    * Tint the image using the provided chroma while preserving the image luminance.
    * An alpha channel may be present and will be unchanged by the operation.
    * @param rgb Parsed by the color module to extract chroma values.
    * @returns A sharp instance that can be used to chain operations
    */
  def tint(rgb: Color): Sharp = js.native
  
  /**
    * Write output to a Buffer. JPEG, PNG, WebP, AVIF, TIFF, GIF and RAW output are supported.
    * By default, the format will match the input image, except SVG input which becomes PNG output.
    * @param options resolve options
    * @param options.resolveWithObject Resolve the Promise with an Object containing data and info properties instead of resolving only with data.
    * @returns A promise that resolves with the Buffer data.
    */
  def toBuffer(): js.Promise[Buffer] = js.native
  /**
    * Write output to a Buffer. JPEG, PNG, WebP, AVIF, TIFF, GIF and RAW output are supported.
    * By default, the format will match the input image, except SVG input which becomes PNG output.
    * @param callback Callback function called on completion with three arguments (err, buffer, info).
    * @returns A sharp instance that can be used to chain operations
    */
  def toBuffer(callback: js.Function3[/* err */ js.Error, /* buffer */ Buffer, /* info */ OutputInfo, Unit]): Sharp = js.native
  def toBuffer(options: ResolveWithObject): js.Promise[Buffer] = js.native
  /**
    * Write output to a Buffer. JPEG, PNG, WebP, AVIF, TIFF, GIF and RAW output are supported.
    * By default, the format will match the input image, except SVG input which becomes PNG output.
    * @param options resolve options
    * @param options.resolveWithObject Resolve the Promise with an Object containing data and info properties instead of resolving only with data.
    * @returns A promise that resolves with an object containing the Buffer data and an info object containing the output image format, size (bytes), width, height and channels
    */
  def toBuffer(options: typings.sharp.anon.`0`): js.Promise[Data] = js.native
  
  /**
    * Alternative spelling of toColourspace().
    * @param colorspace output colorspace e.g. srgb, rgb, cmyk, lab, b-w ...
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def toColorspace(colorspace: String): Sharp = js.native
  
  /**
    * Set the output colourspace.
    * By default output image will be web-friendly sRGB, with additional channels interpreted as alpha channels.
    * @param colourspace output colourspace e.g. srgb, rgb, cmyk, lab, b-w ...
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def toColourspace(): Sharp = js.native
  def toColourspace(colourspace: String): Sharp = js.native
  
  /**
    * Write output image data to a file.
    * @param fileOut The path to write the image data to.
    * @throws {Error} Invalid parameters
    * @returns A promise that fulfills with an object containing information on the resulting file
    */
  def toFile(fileOut: String): js.Promise[OutputInfo] = js.native
  //#endregion
  //#region Output functions
  /**
    * Write output image data to a file.
    * If an explicit output format is not selected, it will be inferred from the extension, with JPEG, PNG, WebP, AVIF, TIFF, DZI, and libvips' V format supported.
    * Note that raw pixel data is only supported for buffer output.
    * @param fileOut The path to write the image data to.
    * @param callback Callback function called on completion with two arguments (err, info).  info contains the output image format, size (bytes), width, height and channels.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def toFile(fileOut: String, callback: js.Function2[/* err */ js.Error, /* info */ OutputInfo, Unit]): Sharp = js.native
  
  /**
    * Force output to a given format.
    * @param format a String or an Object with an 'id' attribute
    * @param options output options
    * @throws {Error} Unsupported format or options
    * @returns A sharp instance that can be used to chain operations
    */
  def toFormat(
    format: avif | dz | fits | gif | heif | input | jpeg | jpg | jp2 | jxl | magick | openslide | pdf | png | ppm | raw | svg | tiff | tif | v | webp
  ): Sharp = js.native
  def toFormat(
    format: avif | dz | fits | gif | heif | input | jpeg | jpg | jp2 | jxl | magick | openslide | pdf | png | ppm | raw | svg | tiff | tif | v | webp,
    options: AvifOptions
  ): Sharp = js.native
  def toFormat(
    format: avif | dz | fits | gif | heif | input | jpeg | jpg | jp2 | jxl | magick | openslide | pdf | png | ppm | raw | svg | tiff | tif | v | webp,
    options: GifOptions
  ): Sharp = js.native
  def toFormat(
    format: avif | dz | fits | gif | heif | input | jpeg | jpg | jp2 | jxl | magick | openslide | pdf | png | ppm | raw | svg | tiff | tif | v | webp,
    options: HeifOptions
  ): Sharp = js.native
  def toFormat(
    format: avif | dz | fits | gif | heif | input | jpeg | jpg | jp2 | jxl | magick | openslide | pdf | png | ppm | raw | svg | tiff | tif | v | webp,
    options: Jp2Options
  ): Sharp = js.native
  def toFormat(
    format: avif | dz | fits | gif | heif | input | jpeg | jpg | jp2 | jxl | magick | openslide | pdf | png | ppm | raw | svg | tiff | tif | v | webp,
    options: JpegOptions
  ): Sharp = js.native
  def toFormat(
    format: avif | dz | fits | gif | heif | input | jpeg | jpg | jp2 | jxl | magick | openslide | pdf | png | ppm | raw | svg | tiff | tif | v | webp,
    options: JxlOptions
  ): Sharp = js.native
  def toFormat(
    format: avif | dz | fits | gif | heif | input | jpeg | jpg | jp2 | jxl | magick | openslide | pdf | png | ppm | raw | svg | tiff | tif | v | webp,
    options: OutputOptions
  ): Sharp = js.native
  def toFormat(
    format: avif | dz | fits | gif | heif | input | jpeg | jpg | jp2 | jxl | magick | openslide | pdf | png | ppm | raw | svg | tiff | tif | v | webp,
    options: PngOptions
  ): Sharp = js.native
  def toFormat(
    format: avif | dz | fits | gif | heif | input | jpeg | jpg | jp2 | jxl | magick | openslide | pdf | png | ppm | raw | svg | tiff | tif | v | webp,
    options: TiffOptions
  ): Sharp = js.native
  def toFormat(
    format: avif | dz | fits | gif | heif | input | jpeg | jpg | jp2 | jxl | magick | openslide | pdf | png | ppm | raw | svg | tiff | tif | v | webp,
    options: WebpOptions
  ): Sharp = js.native
  def toFormat(format: AvailableFormatInfo): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: AvifOptions): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: GifOptions): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: HeifOptions): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: Jp2Options): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: JpegOptions): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: JxlOptions): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: OutputOptions): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: PngOptions): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: TiffOptions): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: WebpOptions): Sharp = js.native
  
  /**
    * Trim pixels from all edges that contain values similar to the given background colour, which defaults to that of the top-left pixel.
    * Images with an alpha channel will use the combined bounding box of alpha and non-alpha channels.
    * The info response Object will contain trimOffsetLeft and trimOffsetTop properties.
    * @param trim The specific background colour to trim, the threshold for doing so or an Object with both.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def trim(): Sharp = js.native
  def trim(trim: String): Sharp = js.native
  def trim(trim: Double): Sharp = js.native
  def trim(trim: TrimOptions): Sharp = js.native
  
  /**
    * Ensure the image has an alpha channel with all white pixel values made fully transparent.
    * Existing alpha channel values for non-white pixels remain unchanged.
    * @returns A sharp instance that can be used to chain operations
    */
  def unflatten(): Sharp = js.native
  
  /**
    * Use these WebP options for output image.
    * @param options Output options.
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def webp(): Sharp = js.native
  def webp(options: WebpOptions): Sharp = js.native
  
  /**
    * Include all metadata (EXIF, XMP, IPTC) from the input image in the output image.
    * The default behaviour, when withMetadata is not used, is to strip all metadata and convert to the device-independent sRGB colour space.
    * This will also convert to and add a web-friendly sRGB ICC profile.
    * @param withMetadata
    * @throws {Error} Invalid parameters.
    */
  def withMetadata(): Sharp = js.native
  def withMetadata(withMetadata: WriteableMetadata): Sharp = js.native
}
