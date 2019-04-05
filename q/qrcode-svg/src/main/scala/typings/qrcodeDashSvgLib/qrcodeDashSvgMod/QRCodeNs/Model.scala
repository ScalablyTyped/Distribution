package typings
package qrcodeDashSvgLib.qrcodeDashSvgMod.QRCodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** The cache used to store data during the creation of this QRCode. */
  var dataCache: js.Array[scala.Double] | scala.Null
  /** A list of the data added to this QRCode. */
  var dataList: js.Array[qrcodeDashSvgLib.Anon_Data]
  /** The numerical error correction level for this QRCode. */
  var errorCorrectLevel: scala.Double
  /** The width/length of this QRCode's modules matrix. */
  var moduleCount: scala.Double
  /**
    * This QRCode's data matrix. A square, two-dimensional boolean array
    * of `moduleCount` x `moduleCount` size. True in a given slot means
    * that spot is filled in in the QRCode visualization.
    */
  var modules: js.Array[js.Array[scala.Boolean]]
  /** The calculated type number for this QRCode. */
  var typeNumber: scala.Double
  /**
    * Queue data up to be added to this QRCode. `make` needs to be called
    *   to actually generate the QRCode from the data.
    * @param data The data to queue up in this QRCode.
    */
  def addData(data: java.lang.String): scala.Unit
  /** Returns the length/width of this QRCode's matrix. */
  def getModuleCount(): scala.Double
  /**
    * Whether a given coordinate is filled in in this QRCode's matrix.
    * @param  row The row to check.
    * @param  col The column to check.
    * @return True if the coordinate is filled in, false otherwise.
    */
  def isDark(row: scala.Double, col: scala.Double): scala.Boolean
  /** Generate this QRCode's matrix from the queued data. */
  def make(): scala.Unit
}

object Model {
  @scala.inline
  def apply(
    addData: java.lang.String => scala.Unit,
    dataList: js.Array[qrcodeDashSvgLib.Anon_Data],
    errorCorrectLevel: scala.Double,
    getModuleCount: () => scala.Double,
    isDark: (scala.Double, scala.Double) => scala.Boolean,
    make: () => scala.Unit,
    moduleCount: scala.Double,
    modules: js.Array[js.Array[scala.Boolean]],
    typeNumber: scala.Double,
    dataCache: js.Array[scala.Double] = null
  ): Model = {
    val __obj = js.Dynamic.literal(addData = js.Any.fromFunction1(addData), dataList = dataList, errorCorrectLevel = errorCorrectLevel, getModuleCount = js.Any.fromFunction0(getModuleCount), isDark = js.Any.fromFunction2(isDark), make = js.Any.fromFunction0(make), moduleCount = moduleCount, modules = modules, typeNumber = typeNumber)
    if (dataCache != null) __obj.updateDynamic("dataCache")(dataCache)
    __obj.asInstanceOf[Model]
  }
}

