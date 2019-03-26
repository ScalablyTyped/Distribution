package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ChildrenIsRowLoaded extends js.Object {
  @JSName("children")
  var children_Original: reactLib.reactMod.ReactNs.Validator[
    js.Function1[
      /* props */ reactDashVirtualizedLib.distEsInfiniteLoaderMod.InfiniteLoaderChildProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.native
  @JSName("isRowLoaded")
  var isRowLoaded_Original: reactLib.reactMod.ReactNs.Validator[
    js.Function1[/* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Boolean]
  ] = js.native
  @JSName("loadMoreRows")
  var loadMoreRows_Original: reactLib.reactMod.ReactNs.Validator[
    js.Function1[
      /* params */ reactDashVirtualizedLib.reactDashVirtualizedMod.IndexRange, 
      js.Promise[_]
    ]
  ] = js.native
  @JSName("minimumBatchSize")
  var minimumBatchSize_Original: reactLib.reactMod.ReactNs.Validator[scala.Double] = js.native
  @JSName("rowCount")
  var rowCount_Original: reactLib.reactMod.ReactNs.Validator[scala.Double] = js.native
  @JSName("threshold")
  var threshold_Original: reactLib.reactMod.ReactNs.Validator[scala.Double] = js.native
  def children(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def isRowLoaded(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def loadMoreRows(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def minimumBatchSize(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def rowCount(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def threshold(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

