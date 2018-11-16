package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QField extends js.Object {
  var qStateCounts: js.UndefOr[ScalablyTyped.runtime.StringDictionary[scala.Double]] = js.native
  var rowCount: js.UndefOr[scala.Double] = js.native
  var rows: js.UndefOr[js.Array[QFieldValue]] = js.native
  def clear(): stdLib.Promise[_] = js.native
  def clearOther(softlock: scala.Boolean): stdLib.Promise[_] = js.native
  def getData(options: GetDataOptions): this.type = js.native
  def getMoreData(): this.type = js.native
  def lock(): stdLib.Promise[_] = js.native
  def select(values: js.Array[scala.Double]): stdLib.Promise[_] = js.native
  def select(values: js.Array[scala.Double], toggle: scala.Boolean): stdLib.Promise[_] = js.native
  def select(values: js.Array[scala.Double], toggle: scala.Boolean, softlock: scala.Boolean): stdLib.Promise[_] = js.native
  def selectAll(): stdLib.Promise[_] = js.native
  def selectAll(softlock: scala.Boolean): stdLib.Promise[_] = js.native
  def selectAlternative(): stdLib.Promise[_] = js.native
  def selectAlternative(softlock: scala.Boolean): stdLib.Promise[_] = js.native
  def selectExcluded(): stdLib.Promise[_] = js.native
  def selectExcluded(softlock: scala.Boolean): stdLib.Promise[_] = js.native
  def selectMatch(`match`: java.lang.String): stdLib.Promise[_] = js.native
  def selectMatch(`match`: java.lang.String, softlock: scala.Boolean): stdLib.Promise[_] = js.native
  def selectPossible(): stdLib.Promise[_] = js.native
  def selectPossible(softlock: scala.Boolean): stdLib.Promise[_] = js.native
  def selectValues(values: js.Array[QFieldValue]): stdLib.Promise[_] = js.native
  def selectValues(values: js.Array[QFieldValue], toggle: scala.Boolean): stdLib.Promise[_] = js.native
  def selectValues(values: js.Array[QFieldValue], toggle: scala.Boolean, softlock: scala.Boolean): stdLib.Promise[_] = js.native
  def toggleSelect(`match`: java.lang.String): stdLib.Promise[_] = js.native
  def toggleSelect(`match`: java.lang.String, softlock: scala.Boolean): stdLib.Promise[_] = js.native
  def unlock(): stdLib.Promise[_] = js.native
}

