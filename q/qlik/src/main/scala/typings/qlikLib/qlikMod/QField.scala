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
  def clear(): js.Promise[_] = js.native
  def clearOther(softlock: scala.Boolean): js.Promise[_] = js.native
  def getData(options: GetDataOptions): this.type = js.native
  def getMoreData(): this.type = js.native
  def lock(): js.Promise[_] = js.native
  def select(values: js.Array[scala.Double]): js.Promise[_] = js.native
  def select(values: js.Array[scala.Double], toggle: scala.Boolean): js.Promise[_] = js.native
  def select(values: js.Array[scala.Double], toggle: scala.Boolean, softlock: scala.Boolean): js.Promise[_] = js.native
  def selectAll(): js.Promise[_] = js.native
  def selectAll(softlock: scala.Boolean): js.Promise[_] = js.native
  def selectAlternative(): js.Promise[_] = js.native
  def selectAlternative(softlock: scala.Boolean): js.Promise[_] = js.native
  def selectExcluded(): js.Promise[_] = js.native
  def selectExcluded(softlock: scala.Boolean): js.Promise[_] = js.native
  def selectMatch(`match`: java.lang.String): js.Promise[_] = js.native
  def selectMatch(`match`: java.lang.String, softlock: scala.Boolean): js.Promise[_] = js.native
  def selectPossible(): js.Promise[_] = js.native
  def selectPossible(softlock: scala.Boolean): js.Promise[_] = js.native
  def selectValues(values: js.Array[QFieldValue]): js.Promise[_] = js.native
  def selectValues(values: js.Array[QFieldValue], toggle: scala.Boolean): js.Promise[_] = js.native
  def selectValues(values: js.Array[QFieldValue], toggle: scala.Boolean, softlock: scala.Boolean): js.Promise[_] = js.native
  def toggleSelect(`match`: java.lang.String): js.Promise[_] = js.native
  def toggleSelect(`match`: java.lang.String, softlock: scala.Boolean): js.Promise[_] = js.native
  def unlock(): js.Promise[_] = js.native
}

