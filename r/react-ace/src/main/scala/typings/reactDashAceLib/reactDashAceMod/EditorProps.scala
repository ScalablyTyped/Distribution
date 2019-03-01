package typings
package reactDashAceLib.reactDashAceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProps extends js.Object {
  @JSName("$blockScrolling")
  var $blockScrolling: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  @JSName("$blockSelectEnabled")
  var $blockSelectEnabled: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$enableBlockSelect")
  var $enableBlockSelect: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$enableMultiselect")
  var $enableMultiselect: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$highlightPending")
  var $highlightPending: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$highlightTagPending")
  var $highlightTagPending: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("$multiselectOnSessionChange")
  var $multiselectOnSessionChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onAddRange")
  var $onAddRange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onChangeAnnotation")
  var $onChangeAnnotation: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onChangeBackMarker")
  var $onChangeBackMarker: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onChangeBreakpoint")
  var $onChangeBreakpoint: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onChangeFold")
  var $onChangeFold: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onChangeFrontMarker")
  var $onChangeFrontMarker: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onChangeMode")
  var $onChangeMode: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onChangeTabSize")
  var $onChangeTabSize: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onChangeWrapLimit")
  var $onChangeWrapLimit: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onChangeWrapMode")
  var $onChangeWrapMode: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onCursorChange")
  var $onCursorChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onDocumentChange")
  var $onDocumentChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onMultiSelect")
  var $onMultiSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onRemoveRange")
  var $onRemoveRange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onScrollLeftChange")
  var $onScrollLeftChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onScrollTopChange")
  var $onScrollTopChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onSelectionChange")
  var $onSelectionChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onSingleSelect")
  var $onSingleSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  @JSName("$onTokenizerUpdate")
  var $onTokenizerUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object EditorProps {
  @scala.inline
  def apply(
    $blockScrolling: scala.Double | scala.Boolean = null,
    $blockSelectEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    $enableBlockSelect: js.UndefOr[scala.Boolean] = js.undefined,
    $enableMultiselect: js.UndefOr[scala.Boolean] = js.undefined,
    $highlightPending: js.UndefOr[scala.Boolean] = js.undefined,
    $highlightTagPending: js.UndefOr[scala.Boolean] = js.undefined,
    $multiselectOnSessionChange: js.Function1[/* repeated */ js.Any, _] = null,
    $onAddRange: js.Function1[/* repeated */ js.Any, _] = null,
    $onChangeAnnotation: js.Function1[/* repeated */ js.Any, _] = null,
    $onChangeBackMarker: js.Function1[/* repeated */ js.Any, _] = null,
    $onChangeBreakpoint: js.Function1[/* repeated */ js.Any, _] = null,
    $onChangeFold: js.Function1[/* repeated */ js.Any, _] = null,
    $onChangeFrontMarker: js.Function1[/* repeated */ js.Any, _] = null,
    $onChangeMode: js.Function1[/* repeated */ js.Any, _] = null,
    $onChangeTabSize: js.Function1[/* repeated */ js.Any, _] = null,
    $onChangeWrapLimit: js.Function1[/* repeated */ js.Any, _] = null,
    $onChangeWrapMode: js.Function1[/* repeated */ js.Any, _] = null,
    $onCursorChange: js.Function1[/* repeated */ js.Any, _] = null,
    $onDocumentChange: js.Function1[/* repeated */ js.Any, _] = null,
    $onMultiSelect: js.Function1[/* repeated */ js.Any, _] = null,
    $onRemoveRange: js.Function1[/* repeated */ js.Any, _] = null,
    $onScrollLeftChange: js.Function1[/* repeated */ js.Any, _] = null,
    $onScrollTopChange: js.Function1[/* repeated */ js.Any, _] = null,
    $onSelectionChange: js.Function1[/* repeated */ js.Any, _] = null,
    $onSingleSelect: js.Function1[/* repeated */ js.Any, _] = null,
    $onTokenizerUpdate: js.Function1[/* repeated */ js.Any, _] = null
  ): EditorProps = {
    val __obj = js.Dynamic.literal()
    if ($blockScrolling != null) __obj.updateDynamic("$blockScrolling")($blockScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined($blockSelectEnabled)) __obj.updateDynamic("$blockSelectEnabled")($blockSelectEnabled)
    if (!js.isUndefined($enableBlockSelect)) __obj.updateDynamic("$enableBlockSelect")($enableBlockSelect)
    if (!js.isUndefined($enableMultiselect)) __obj.updateDynamic("$enableMultiselect")($enableMultiselect)
    if (!js.isUndefined($highlightPending)) __obj.updateDynamic("$highlightPending")($highlightPending)
    if (!js.isUndefined($highlightTagPending)) __obj.updateDynamic("$highlightTagPending")($highlightTagPending)
    if ($multiselectOnSessionChange != null) __obj.updateDynamic("$multiselectOnSessionChange")($multiselectOnSessionChange)
    if ($onAddRange != null) __obj.updateDynamic("$onAddRange")($onAddRange)
    if ($onChangeAnnotation != null) __obj.updateDynamic("$onChangeAnnotation")($onChangeAnnotation)
    if ($onChangeBackMarker != null) __obj.updateDynamic("$onChangeBackMarker")($onChangeBackMarker)
    if ($onChangeBreakpoint != null) __obj.updateDynamic("$onChangeBreakpoint")($onChangeBreakpoint)
    if ($onChangeFold != null) __obj.updateDynamic("$onChangeFold")($onChangeFold)
    if ($onChangeFrontMarker != null) __obj.updateDynamic("$onChangeFrontMarker")($onChangeFrontMarker)
    if ($onChangeMode != null) __obj.updateDynamic("$onChangeMode")($onChangeMode)
    if ($onChangeTabSize != null) __obj.updateDynamic("$onChangeTabSize")($onChangeTabSize)
    if ($onChangeWrapLimit != null) __obj.updateDynamic("$onChangeWrapLimit")($onChangeWrapLimit)
    if ($onChangeWrapMode != null) __obj.updateDynamic("$onChangeWrapMode")($onChangeWrapMode)
    if ($onCursorChange != null) __obj.updateDynamic("$onCursorChange")($onCursorChange)
    if ($onDocumentChange != null) __obj.updateDynamic("$onDocumentChange")($onDocumentChange)
    if ($onMultiSelect != null) __obj.updateDynamic("$onMultiSelect")($onMultiSelect)
    if ($onRemoveRange != null) __obj.updateDynamic("$onRemoveRange")($onRemoveRange)
    if ($onScrollLeftChange != null) __obj.updateDynamic("$onScrollLeftChange")($onScrollLeftChange)
    if ($onScrollTopChange != null) __obj.updateDynamic("$onScrollTopChange")($onScrollTopChange)
    if ($onSelectionChange != null) __obj.updateDynamic("$onSelectionChange")($onSelectionChange)
    if ($onSingleSelect != null) __obj.updateDynamic("$onSingleSelect")($onSingleSelect)
    if ($onTokenizerUpdate != null) __obj.updateDynamic("$onTokenizerUpdate")($onTokenizerUpdate)
    __obj.asInstanceOf[EditorProps]
  }
}

