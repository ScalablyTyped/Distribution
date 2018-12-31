package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxDimensionInfo extends ColumnInfo {
  var qContinuousAxes: scala.Boolean
  var qDerivedField: scala.Boolean
  var qDimensionType: qlikLib.qlikLibStrings.D | qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.T
  var qGroupFallbackTitles: js.Array[java.lang.String]
  var qGroupFieldDefs: js.Array[java.lang.String]
  var qGroupPos: scala.Double
  var qGrouping: qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.H | qlikLib.qlikLibStrings.C
  var qIsCyclic: scala.Boolean
  var qIsSemantic: scala.Boolean
  var qLocker: java.lang.String
  var qStateCounts: NxStateCounts
  var qTags: js.Array[java.lang.String]
}

