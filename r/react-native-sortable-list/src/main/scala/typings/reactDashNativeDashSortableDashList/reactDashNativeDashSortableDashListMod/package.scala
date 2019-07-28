package typings.reactDashNativeDashSortableDashList

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ClassicComponentClass
import typings.reactDashNativeDashSortableDashList.DataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashSortableDashListMod {
  type Data = DataByNumber | DataByString
  type DataByNumber = NumberDictionary[DataValue]
  type DataByString = StringDictionary[DataValue]
  type DataKey = String | Double
  type SortableList = SortableListStatic
  type SortableListStatic = ClassicComponentClass[SortableListProps]
}
