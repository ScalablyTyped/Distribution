package typings
package rpioLib.RPIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * There are two device nodes for GPIO access. The default is /dev/gpiomem which, when configured with gpio group access, allows users in that group to read/write directly to that device. This removes the need to run as root, but is limited to GPIO functions.
    * For non-GPIO functions (i²c, PWM, SPI) the /dev/mem device is required for full access to the Broadcom peripheral address range and the program needs to be executed as the root user (e.g. via sudo). If you do not explicitly call .init() when using those functions, the library will do it for you with gpiomem: false.
    * You may also need to use gpiomem: false if you are running on an older Linux kernel which does not support the gpiomem module.
    * rpio will throw an exception if you try to use one of the non-GPIO functions after already opening with /dev/gpiomem, as well as checking to see if you have the necessary permissions.
    *
    * Valid options:
    * true: use /dev/gpiomem for non-root but GPIO-only access
    * false: use /dev/mem for full access but requires root
    */
  var gpiomem: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * There are two naming schemes when referring to GPIO pins:
    * By their physical header location: Pins 1 to 26 (A/B) or Pins 1 to 40 (A+/B+)
    * Using the Broadcom hardware map: GPIO 0-25 (B rev1), GPIO 2-27 (A/B rev2, A+/B+)
    *
    * Confusingly however, the Broadcom GPIO map changes between revisions, so for example P3 maps to GPIO0 on Model B Revision 1 models, but maps to GPIO2 on all later models.
    * This means the only sane default mapping is the physical layout, so that the same code will work on all models regardless of the underlying GPIO mapping.
    * If you prefer to use the Broadcom GPIO scheme for whatever reason (e.g. to use the P5 header pins on the Raspberry Pi 1 revision 2.0 model which aren't currently mapped to the physical layout), you can set mapping to gpio to switch to the GPIOxx naming.
    *
    * Valid options:
    * gpio: use the Broadcom GPIOxx naming
    * physical: use the physical P01-P40 header layou
    */
  var mapping: js.UndefOr[rpioLib.rpioLibStrings.gpio | rpioLib.rpioLibStrings.physical] = js.undefined
}

