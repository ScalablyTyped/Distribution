package typings.projectDashOxford.projectDashOxfordMod

import typings.bluebird.bluebirdMod.^
import typings.node.streamMod.Stream
import typings.projectDashOxford.projectDashOxfordMod.OptionsNs.Analyze
import typings.projectDashOxford.projectDashOxfordMod.OptionsNs.Ocr
import typings.projectDashOxford.projectDashOxfordMod.OptionsNs.Thumbnail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("project-oxford", "VisionAPI")
@js.native
class VisionAPI () extends js.Object {
  /**
    * This operation does a deep analysis on the given image and then extracts a
    * set of rich visual features based on the image content.
    *
    * @param  {Object}  options                - Options object describing features to extract
    * @param  {string}  options.url            - Url to image to be analyzed
    * @param  {string}  options.path           - Path to image to be analyzed
    * @param  {boolean} options.ImageType      - Detects if image is clipart or a line drawing.
    * @param  {boolean} options.Color          - Determines the accent color, dominant color, if image is black&white.
    * @param  {boolean} options.Faces          - Detects if faces are present. If present, generate coordinates, gender and age.
    * @param  {boolean} options.Adult          - Detects if image is pornographic in nature (nudity or sex act). Sexually suggestive content is also detected.
    * @param  {boolean} options.Categories     - Image categorization; taxonomy defined in documentation.
    * @return {Promise}                        - Promise resolving with the resulting JSON
    */
  def analyzeImage(options: Analyze): ^[typings.projectDashOxford.projectDashOxfordMod.VisionResponsesNs.Analyze] = js.native
  /**
    * Optical Character Recognition (OCR) detects text in an image and extracts the recognized
    * characters into a machine-usable character stream.
    *
    * @param  {Object}  options                    - Options object describing features to extract
    * @param  {string}  options.url                - Url to image to be analyzed
    * @param  {string}  options.path               - Path to image to be analyzed
    * @param  {string}  options.language           - BCP-47 language code of the text to be detected in the image. Default value is "unk", then the service will auto detect the language of the text in the image.
    * @param  {string}  options.detectOrientation  - Detect orientation of text in the image
    * @return {Promise}                            - Promise resolving with the resulting JSON
    */
  def ocr(options: Ocr): ^[typings.projectDashOxford.projectDashOxfordMod.VisionResponsesNs.Ocr] = js.native
  /**
    * Generate a thumbnail image to the user-specified width and height. By default, the
    * service analyzes the image, identifies the region of interest (ROI), and generates
    * smart crop coordinates based on the ROI. Smart cropping is designed to help when you
    * specify an aspect ratio that differs from the input image.
    *
    * @param  {Object}  options                - Options object describing features to extract
    * @param  {string}  options.url            - Url to image to be thumbnailed
    * @param  {string}  options.path           - Path to image to be thumbnailed
    * @param  {number}  options.width          - Width of the thumb in pixels
    * @param  {number}  options.height         - Height of the thumb in pixels
    * @param  {boolean} options.smartCropping  - Should SmartCropping be enabled?
    * @param  {Object}  options.pipe           - We'll pipe the returned image to this object
    * @return {Promise}                        - Promise resolving with the resulting JSON
    */
  def thumbnail(options: Thumbnail): ^[Stream] = js.native
}

