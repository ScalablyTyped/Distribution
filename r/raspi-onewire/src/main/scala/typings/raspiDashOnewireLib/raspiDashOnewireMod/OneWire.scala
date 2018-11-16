package typings
package raspiDashOnewireLib.raspiDashOnewireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-onewire", "OneWire")
@js.native
class OneWire ()
  extends raspiDashPeripheralLib.raspiDashPeripheralMod.Peripheral {
  var _deviceIdMapping: js.Any = js.native
  /* private */ def _convertIDToMappingKey(deviceID: js.Any): js.Any = js.native
  /* private */ def _getNameFromID(deviceID: js.Any): js.Any = js.native
  def read(
    deviceID: js.Array[scala.Double],
    numBytesToRead: scala.Double,
    cb: js.Function2[
      /* err */ js.UndefOr[java.lang.String | nodeLib.Error], 
      /* data */ js.UndefOr[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readAllAvailable(
    deviceID: js.Array[scala.Double],
    cb: js.Function2[
      /* err */ js.UndefOr[java.lang.String | nodeLib.Error], 
      /* data */ js.UndefOr[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def searchForDevices(
    cb: js.Function2[
      /* readErr */ js.UndefOr[java.lang.String | nodeLib.Error], 
      /* devices */ js.UndefOr[js.Array[js.Array[scala.Double]]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

