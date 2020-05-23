package typings.qrcodeSvg.mod

import typings.qrcodeSvg.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** The cache used to store data during the creation of this QRCode. */
  var dataCache: js.Array[Double] | Null
  /** A list of the data added to this QRCode. */
  var dataList: js.Array[Data]
  /** The numerical error correction level for this QRCode. */
  var errorCorrectLevel: Double
  /** The width/length of this QRCode's modules matrix. */
  var moduleCount: Double
  /**
    * This QRCode's data matrix. A square, two-dimensional boolean array
    * of `moduleCount` x `moduleCount` size. True in a given slot means
    * that spot is filled in in the QRCode visualization.
    */
  var modules: js.Array[js.Array[Boolean]]
  /** The calculated type number for this QRCode. */
  var typeNumber: Double
  /**
    * Queue data up to be added to this QRCode. `make` needs to be called
    *   to actually generate the QRCode from the data.
    * @param data The data to queue up in this QRCode.
    */
  def addData(data: String): Unit
  /** Returns the length/width of this QRCode's matrix. */
  def getModuleCount(): Double
  /**
    * Whether a given coordinate is filled in in this QRCode's matrix.
    * @param  row The row to check.
    * @param  col The column to check.
    * @return True if the coordinate is filled in, false otherwise.
    */
  def isDark(row: Double, col: Double): Boolean
  /** Generate this QRCode's matrix from the queued data. */
  def make(): Unit
}

object Model {
  @scala.inline
  def apply(
    addData: String => Unit,
    dataList: js.Array[Data],
    errorCorrectLevel: Double,
    getModuleCount: () => Double,
    isDark: (Double, Double) => Boolean,
    make: () => Unit,
    moduleCount: Double,
    modules: js.Array[js.Array[Boolean]],
    typeNumber: Double,
    dataCache: js.Array[Double] = null
  ): Model = {
    val __obj = js.Dynamic.literal(addData = js.Any.fromFunction1(addData), dataList = dataList.asInstanceOf[js.Any], errorCorrectLevel = errorCorrectLevel.asInstanceOf[js.Any], getModuleCount = js.Any.fromFunction0(getModuleCount), isDark = js.Any.fromFunction2(isDark), make = js.Any.fromFunction0(make), moduleCount = moduleCount.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], typeNumber = typeNumber.asInstanceOf[js.Any], dataCache = dataCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

