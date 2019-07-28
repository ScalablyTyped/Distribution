package typings.reactDashAce.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorProps
  extends /* index */ StringDictionary[js.Any] {
  @JSName("$blockScrolling")
  var $blockScrolling: js.UndefOr[Double | Boolean] = js.undefined
  @JSName("$blockSelectEnabled")
  var $blockSelectEnabled: js.UndefOr[Boolean] = js.undefined
  @JSName("$enableBlockSelect")
  var $enableBlockSelect: js.UndefOr[Boolean] = js.undefined
  @JSName("$enableMultiselect")
  var $enableMultiselect: js.UndefOr[Boolean] = js.undefined
  @JSName("$highlightPending")
  var $highlightPending: js.UndefOr[Boolean] = js.undefined
  @JSName("$highlightTagPending")
  var $highlightTagPending: js.UndefOr[Boolean] = js.undefined
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

object IEditorProps {
  @scala.inline
  def apply(
    $blockScrolling: Double | Boolean = null,
    $blockSelectEnabled: js.UndefOr[Boolean] = js.undefined,
    $enableBlockSelect: js.UndefOr[Boolean] = js.undefined,
    $enableMultiselect: js.UndefOr[Boolean] = js.undefined,
    $highlightPending: js.UndefOr[Boolean] = js.undefined,
    $highlightTagPending: js.UndefOr[Boolean] = js.undefined,
    $multiselectOnSessionChange: /* repeated */ js.Any => _ = null,
    $onAddRange: /* repeated */ js.Any => _ = null,
    $onChangeAnnotation: /* repeated */ js.Any => _ = null,
    $onChangeBackMarker: /* repeated */ js.Any => _ = null,
    $onChangeBreakpoint: /* repeated */ js.Any => _ = null,
    $onChangeFold: /* repeated */ js.Any => _ = null,
    $onChangeFrontMarker: /* repeated */ js.Any => _ = null,
    $onChangeMode: /* repeated */ js.Any => _ = null,
    $onChangeTabSize: /* repeated */ js.Any => _ = null,
    $onChangeWrapLimit: /* repeated */ js.Any => _ = null,
    $onChangeWrapMode: /* repeated */ js.Any => _ = null,
    $onCursorChange: /* repeated */ js.Any => _ = null,
    $onDocumentChange: /* repeated */ js.Any => _ = null,
    $onMultiSelect: /* repeated */ js.Any => _ = null,
    $onRemoveRange: /* repeated */ js.Any => _ = null,
    $onScrollLeftChange: /* repeated */ js.Any => _ = null,
    $onScrollTopChange: /* repeated */ js.Any => _ = null,
    $onSelectionChange: /* repeated */ js.Any => _ = null,
    $onSingleSelect: /* repeated */ js.Any => _ = null,
    $onTokenizerUpdate: /* repeated */ js.Any => _ = null,
    StringDictionary: /* index */ StringDictionary[js.Any] = null
  ): IEditorProps = {
    val __obj = js.Dynamic.literal()
    if ($blockScrolling != null) __obj.updateDynamic("$blockScrolling")($blockScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined($blockSelectEnabled)) __obj.updateDynamic("$blockSelectEnabled")($blockSelectEnabled)
    if (!js.isUndefined($enableBlockSelect)) __obj.updateDynamic("$enableBlockSelect")($enableBlockSelect)
    if (!js.isUndefined($enableMultiselect)) __obj.updateDynamic("$enableMultiselect")($enableMultiselect)
    if (!js.isUndefined($highlightPending)) __obj.updateDynamic("$highlightPending")($highlightPending)
    if (!js.isUndefined($highlightTagPending)) __obj.updateDynamic("$highlightTagPending")($highlightTagPending)
    if ($multiselectOnSessionChange != null) __obj.updateDynamic("$multiselectOnSessionChange")(js.Any.fromFunction1($multiselectOnSessionChange))
    if ($onAddRange != null) __obj.updateDynamic("$onAddRange")(js.Any.fromFunction1($onAddRange))
    if ($onChangeAnnotation != null) __obj.updateDynamic("$onChangeAnnotation")(js.Any.fromFunction1($onChangeAnnotation))
    if ($onChangeBackMarker != null) __obj.updateDynamic("$onChangeBackMarker")(js.Any.fromFunction1($onChangeBackMarker))
    if ($onChangeBreakpoint != null) __obj.updateDynamic("$onChangeBreakpoint")(js.Any.fromFunction1($onChangeBreakpoint))
    if ($onChangeFold != null) __obj.updateDynamic("$onChangeFold")(js.Any.fromFunction1($onChangeFold))
    if ($onChangeFrontMarker != null) __obj.updateDynamic("$onChangeFrontMarker")(js.Any.fromFunction1($onChangeFrontMarker))
    if ($onChangeMode != null) __obj.updateDynamic("$onChangeMode")(js.Any.fromFunction1($onChangeMode))
    if ($onChangeTabSize != null) __obj.updateDynamic("$onChangeTabSize")(js.Any.fromFunction1($onChangeTabSize))
    if ($onChangeWrapLimit != null) __obj.updateDynamic("$onChangeWrapLimit")(js.Any.fromFunction1($onChangeWrapLimit))
    if ($onChangeWrapMode != null) __obj.updateDynamic("$onChangeWrapMode")(js.Any.fromFunction1($onChangeWrapMode))
    if ($onCursorChange != null) __obj.updateDynamic("$onCursorChange")(js.Any.fromFunction1($onCursorChange))
    if ($onDocumentChange != null) __obj.updateDynamic("$onDocumentChange")(js.Any.fromFunction1($onDocumentChange))
    if ($onMultiSelect != null) __obj.updateDynamic("$onMultiSelect")(js.Any.fromFunction1($onMultiSelect))
    if ($onRemoveRange != null) __obj.updateDynamic("$onRemoveRange")(js.Any.fromFunction1($onRemoveRange))
    if ($onScrollLeftChange != null) __obj.updateDynamic("$onScrollLeftChange")(js.Any.fromFunction1($onScrollLeftChange))
    if ($onScrollTopChange != null) __obj.updateDynamic("$onScrollTopChange")(js.Any.fromFunction1($onScrollTopChange))
    if ($onSelectionChange != null) __obj.updateDynamic("$onSelectionChange")(js.Any.fromFunction1($onSelectionChange))
    if ($onSingleSelect != null) __obj.updateDynamic("$onSingleSelect")(js.Any.fromFunction1($onSingleSelect))
    if ($onTokenizerUpdate != null) __obj.updateDynamic("$onTokenizerUpdate")(js.Any.fromFunction1($onTokenizerUpdate))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IEditorProps]
  }
}

