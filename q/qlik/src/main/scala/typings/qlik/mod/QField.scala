package typings.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QField extends StObject {
  
  def clear(): js.Promise[Any] = js.native
  
  def clearOther(softlock: Boolean): js.Promise[Any] = js.native
  
  def getData(options: GetDataOptions): this.type = js.native
  
  def getMoreData(): this.type = js.native
  
  def lock(): js.Promise[Any] = js.native
  
  var qStateCounts: js.UndefOr[StringDictionary[Double]] = js.native
  
  var rowCount: js.UndefOr[Double] = js.native
  
  var rows: js.UndefOr[js.Array[QFieldValue]] = js.native
  
  def select(values: js.Array[Double]): js.Promise[Any] = js.native
  def select(values: js.Array[Double], toggle: Boolean): js.Promise[Any] = js.native
  def select(values: js.Array[Double], toggle: Boolean, softlock: Boolean): js.Promise[Any] = js.native
  def select(values: js.Array[Double], toggle: Unit, softlock: Boolean): js.Promise[Any] = js.native
  
  def selectAll(): js.Promise[Any] = js.native
  def selectAll(softlock: Boolean): js.Promise[Any] = js.native
  
  def selectAlternative(): js.Promise[Any] = js.native
  def selectAlternative(softlock: Boolean): js.Promise[Any] = js.native
  
  def selectExcluded(): js.Promise[Any] = js.native
  def selectExcluded(softlock: Boolean): js.Promise[Any] = js.native
  
  def selectMatch(`match`: String): js.Promise[Any] = js.native
  def selectMatch(`match`: String, softlock: Boolean): js.Promise[Any] = js.native
  
  def selectPossible(): js.Promise[Any] = js.native
  def selectPossible(softlock: Boolean): js.Promise[Any] = js.native
  
  def selectValues(values: js.Array[QFieldValue]): js.Promise[Any] = js.native
  def selectValues(values: js.Array[QFieldValue], toggle: Boolean): js.Promise[Any] = js.native
  def selectValues(values: js.Array[QFieldValue], toggle: Boolean, softlock: Boolean): js.Promise[Any] = js.native
  def selectValues(values: js.Array[QFieldValue], toggle: Unit, softlock: Boolean): js.Promise[Any] = js.native
  
  def toggleSelect(`match`: String): js.Promise[Any] = js.native
  def toggleSelect(`match`: String, softlock: Boolean): js.Promise[Any] = js.native
  
  def unlock(): js.Promise[Any] = js.native
}
