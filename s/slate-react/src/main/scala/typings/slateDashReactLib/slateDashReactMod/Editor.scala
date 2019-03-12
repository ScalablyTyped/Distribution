package typings
package slateDashReactLib.slateDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "Editor")
@js.native
class Editor ()
  extends reactLib.reactMod.Component[EditorProps, EditorState, js.Any]
     with slateLib.slateMod.Controller {
  // Controller
  var addMark: (js.Function1[/* mark */ slateLib.slateMod.Mark, slateLib.slateMod.Editor]) | (js.Function1[/* mark */ slateLib.slateMod.MarkProperties, slateLib.slateMod.Editor]) | (js.Function1[/* mark */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* mark */ slateLib.slateMod.Mark, slateLib.slateMod.Controller]) | (js.Function1[/* mark */ slateLib.slateMod.MarkProperties, slateLib.slateMod.Controller]) | (js.Function1[/* mark */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var addMarkAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var addMarkByKey: (js.Function4[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function4[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Controller
  ]) | (js.Function4[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var addMarkByPath: (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Controller
  ]) | (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var applyOperation: (js.Function1[/* operation */ slateLib.slateMod.Operation, slateLib.slateMod.Editor]) | (js.Function1[/* operation */ slateLib.slateMod.Operation, slateLib.slateMod.Controller]) = js.native
  @JSName("blur")
  var blur_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var command: (js.Function2[/* name */ java.lang.String, /* repeated */ js.Any, slateLib.slateMod.Editor]) | (js.Function2[/* name */ java.lang.String, /* repeated */ js.Any, slateLib.slateMod.Controller]) = js.native
  var controller: slateLib.slateMod.Editor = js.native
  var deleteAtRange: (js.Function1[/* range */ slateLib.slateMod.Range, slateLib.slateMod.Editor]) | (js.Function1[/* range */ slateLib.slateMod.Range, slateLib.slateMod.Controller]) = js.native
  var deleteBackward: (js.Function1[/* n */ scala.Double, slateLib.slateMod.Editor]) | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Controller]) = js.native
  var deleteBackwardAtRange: (js.Function2[/* range */ slateLib.slateMod.Range, /* n */ scala.Double, slateLib.slateMod.Editor]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* n */ scala.Double, 
    slateLib.slateMod.Controller
  ]) = js.native
  var deleteCharBackwardAtRange: (js.Function1[/* range */ slateLib.slateMod.Range, slateLib.slateMod.Editor]) | (js.Function1[/* range */ slateLib.slateMod.Range, slateLib.slateMod.Controller]) = js.native
  var deleteCharForwardAtRange: (js.Function1[/* range */ slateLib.slateMod.Range, slateLib.slateMod.Editor]) | (js.Function1[/* range */ slateLib.slateMod.Range, slateLib.slateMod.Controller]) = js.native
  var deleteForward: (js.Function1[/* n */ scala.Double, slateLib.slateMod.Editor]) | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Controller]) = js.native
  var deleteForwardAtRange: (js.Function2[/* range */ slateLib.slateMod.Range, /* n */ scala.Double, slateLib.slateMod.Editor]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* n */ scala.Double, 
    slateLib.slateMod.Controller
  ]) = js.native
  var deleteLineBackwardAtRange: (js.Function1[/* range */ slateLib.slateMod.Range, slateLib.slateMod.Editor]) | (js.Function1[/* range */ slateLib.slateMod.Range, slateLib.slateMod.Controller]) = js.native
  var deleteLineForwardAtRange: (js.Function1[/* range */ slateLib.slateMod.Range, slateLib.slateMod.Editor]) | (js.Function1[/* range */ slateLib.slateMod.Range, slateLib.slateMod.Controller]) = js.native
  var deleteWordBackwardAtRange: (js.Function1[/* range */ slateLib.slateMod.Range, slateLib.slateMod.Editor]) | (js.Function1[/* range */ slateLib.slateMod.Range, slateLib.slateMod.Controller]) = js.native
  var deleteWordForwardAtRange: (js.Function1[/* range */ slateLib.slateMod.Range, slateLib.slateMod.Editor]) | (js.Function1[/* range */ slateLib.slateMod.Range, slateLib.slateMod.Controller]) = js.native
  @JSName("delete")
  var delete_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("deselect")
  var deselect_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("flip")
  var flip_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("focus")
  var focus_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var insertBlock: (js.Function1[/* block */ slateLib.slateMod.Block, slateLib.slateMod.Editor]) | (js.Function1[/* block */ slateLib.slateMod.BlockProperties, slateLib.slateMod.Editor]) | (js.Function1[/* block */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* block */ slateLib.slateMod.Block, slateLib.slateMod.Controller]) | (js.Function1[/* block */ slateLib.slateMod.BlockProperties, slateLib.slateMod.Controller]) | (js.Function1[/* block */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var insertBlockAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* block */ slateLib.slateMod.Block, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* block */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* block */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* block */ slateLib.slateMod.Block, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* block */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* block */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var insertFragment: (js.Function1[
    /* fragment */ slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]], 
    slateLib.slateMod.Editor
  ]) | (js.Function1[
    /* fragment */ slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]], 
    slateLib.slateMod.Controller
  ]) = js.native
  var insertFragmentAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* fragment */ slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]], 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* fragment */ slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]], 
    slateLib.slateMod.Controller
  ]) = js.native
  var insertFragmentByKey: (js.Function3[
    /* key */ java.lang.String, 
    /* index */ scala.Double, 
    /* fragment */ slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]], 
    slateLib.slateMod.Editor
  ]) | (js.Function3[
    /* key */ java.lang.String, 
    /* index */ scala.Double, 
    /* fragment */ slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]], 
    slateLib.slateMod.Controller
  ]) = js.native
  var insertFragmentByPath: (js.Function3[
    /* path */ slateLib.slateMod.Path, 
    /* index */ scala.Double, 
    /* fragment */ slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]], 
    slateLib.slateMod.Editor
  ]) | (js.Function3[
    /* path */ slateLib.slateMod.Path, 
    /* index */ scala.Double, 
    /* fragment */ slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]], 
    slateLib.slateMod.Controller
  ]) = js.native
  var insertInline: (js.Function1[/* inline */ slateLib.slateMod.Inline, slateLib.slateMod.Editor]) | (js.Function1[/* inline */ slateLib.slateMod.InlineProperties, slateLib.slateMod.Editor]) | (js.Function1[/* inline */ slateLib.slateMod.Inline, slateLib.slateMod.Controller]) | (js.Function1[/* inline */ slateLib.slateMod.InlineProperties, slateLib.slateMod.Controller]) = js.native
  var insertInlineAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* inline */ slateLib.slateMod.Inline, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* inline */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* inline */ slateLib.slateMod.Inline, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* inline */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Controller
  ]) = js.native
  var insertNodeByKey: (js.Function3[
    /* key */ java.lang.String, 
    /* index */ scala.Double, 
    /* node */ slateLib.slateMod.Node, 
    slateLib.slateMod.Editor
  ]) | (js.Function3[
    /* key */ java.lang.String, 
    /* index */ scala.Double, 
    /* node */ slateLib.slateMod.Node, 
    slateLib.slateMod.Controller
  ]) = js.native
  var insertNodeByPath: (js.Function3[
    /* path */ slateLib.slateMod.Path, 
    /* index */ scala.Double, 
    /* node */ slateLib.slateMod.Node, 
    slateLib.slateMod.Editor
  ]) | (js.Function3[
    /* path */ slateLib.slateMod.Path, 
    /* index */ scala.Double, 
    /* node */ slateLib.slateMod.Node, 
    slateLib.slateMod.Controller
  ]) = js.native
  var insertText: (js.Function1[/* text */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* text */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var insertTextAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* text */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* text */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var insertTextByKey: (js.Function3[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* text */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* text */ java.lang.String, 
    /* marks */ immutableLib.immutableMod.Set[slateLib.slateMod.Mark], 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* text */ java.lang.String, 
    /* marks */ js.Array[slateLib.slateMod.Mark], 
    slateLib.slateMod.Editor
  ]) | (js.Function3[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* text */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) | (js.Function4[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* text */ java.lang.String, 
    /* marks */ immutableLib.immutableMod.Set[slateLib.slateMod.Mark], 
    slateLib.slateMod.Controller
  ]) | (js.Function4[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* text */ java.lang.String, 
    /* marks */ js.Array[slateLib.slateMod.Mark], 
    slateLib.slateMod.Controller
  ]) = js.native
  var insertTextByPath: (js.Function3[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* text */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* text */ java.lang.String, 
    /* marks */ immutableLib.immutableMod.Set[slateLib.slateMod.Mark], 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* text */ java.lang.String, 
    /* marks */ js.Array[slateLib.slateMod.Mark], 
    slateLib.slateMod.Editor
  ]) | (js.Function3[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* text */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) | (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* text */ java.lang.String, 
    /* marks */ immutableLib.immutableMod.Set[slateLib.slateMod.Mark], 
    slateLib.slateMod.Controller
  ]) | (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* text */ java.lang.String, 
    /* marks */ js.Array[slateLib.slateMod.Mark], 
    slateLib.slateMod.Controller
  ]) = js.native
  var mergeNodeByKey: (js.Function1[/* key */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* key */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var mergeNodeByPath: (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Editor]) | (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Controller]) = js.native
  @JSName("moveAnchorBackward")
  var moveAnchorBackward_FEditor: js.Function0[slateLib.slateMod.Editor] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Editor]) | js.Function0[slateLib.slateMod.Controller] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Controller]) = js.native
  var moveAnchorEndOfNode: (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Editor]) | (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Controller]) = js.native
  @JSName("moveAnchorForward")
  var moveAnchorForward_FEditor: js.Function0[slateLib.slateMod.Editor] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Editor]) | js.Function0[slateLib.slateMod.Controller] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Controller]) = js.native
  var moveAnchorTo: (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Editor]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    slateLib.slateMod.Editor
  ]) | (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Controller]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    slateLib.slateMod.Controller
  ]) = js.native
  @JSName("moveAnchorToEndOfBlock")
  var moveAnchorToEndOfBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToEndOfDocument")
  var moveAnchorToEndOfDocument_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToEndOfInline")
  var moveAnchorToEndOfInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToEndOfNextBlock")
  var moveAnchorToEndOfNextBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToEndOfNextInline")
  var moveAnchorToEndOfNextInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToEndOfNextText")
  var moveAnchorToEndOfNextText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToEndOfPreviousBlock")
  var moveAnchorToEndOfPreviousBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToEndOfPreviousInline")
  var moveAnchorToEndOfPreviousInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToEndOfPreviousText")
  var moveAnchorToEndOfPreviousText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToEndOfText")
  var moveAnchorToEndOfText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToStartOfBlock")
  var moveAnchorToStartOfBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToStartOfDocument")
  var moveAnchorToStartOfDocument_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToStartOfInline")
  var moveAnchorToStartOfInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToStartOfNextBlock")
  var moveAnchorToStartOfNextBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToStartOfNextInline")
  var moveAnchorToStartOfNextInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToStartOfNextText")
  var moveAnchorToStartOfNextText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var moveAnchorToStartOfNode: (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Editor]) | (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Controller]) = js.native
  @JSName("moveAnchorToStartOfPreviousBlock")
  var moveAnchorToStartOfPreviousBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToStartOfPreviousInline")
  var moveAnchorToStartOfPreviousInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToStartOfPreviousText")
  var moveAnchorToStartOfPreviousText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveAnchorToStartOfText")
  var moveAnchorToStartOfText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveBackward")
  var moveBackward_FEditor: js.Function0[slateLib.slateMod.Editor] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Editor]) | js.Function0[slateLib.slateMod.Controller] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Controller]) = js.native
  @JSName("moveEndBackward")
  var moveEndBackward_FEditor: js.Function0[slateLib.slateMod.Editor] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Editor]) | js.Function0[slateLib.slateMod.Controller] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Controller]) = js.native
  @JSName("moveEndForward")
  var moveEndForward_FEditor: js.Function0[slateLib.slateMod.Editor] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Editor]) | js.Function0[slateLib.slateMod.Controller] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Controller]) = js.native
  var moveEndTo: (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Editor]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    slateLib.slateMod.Editor
  ]) | (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Controller]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    slateLib.slateMod.Controller
  ]) = js.native
  @JSName("moveEndToEndOfBlock")
  var moveEndToEndOfBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToEndOfDocument")
  var moveEndToEndOfDocument_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToEndOfInline")
  var moveEndToEndOfInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToEndOfNextBlock")
  var moveEndToEndOfNextBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToEndOfNextInline")
  var moveEndToEndOfNextInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToEndOfNextText")
  var moveEndToEndOfNextText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var moveEndToEndOfNode: (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Editor]) | (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Controller]) = js.native
  @JSName("moveEndToEndOfPreviousBlock")
  var moveEndToEndOfPreviousBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToEndOfPreviousInline")
  var moveEndToEndOfPreviousInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToEndOfPreviousText")
  var moveEndToEndOfPreviousText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToEndOfText")
  var moveEndToEndOfText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToStartOfBlock")
  var moveEndToStartOfBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToStartOfDocument")
  var moveEndToStartOfDocument_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToStartOfInline")
  var moveEndToStartOfInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToStartOfNextBlock")
  var moveEndToStartOfNextBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToStartOfNextInline")
  var moveEndToStartOfNextInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToStartOfNextText")
  var moveEndToStartOfNextText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var moveEndToStartOfNode: (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Editor]) | (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Controller]) = js.native
  @JSName("moveEndToStartOfPreviousBlock")
  var moveEndToStartOfPreviousBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToStartOfPreviousInline")
  var moveEndToStartOfPreviousInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToStartOfPreviousText")
  var moveEndToStartOfPreviousText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveEndToStartOfText")
  var moveEndToStartOfText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusBackward")
  var moveFocusBackward_FEditor: js.Function0[slateLib.slateMod.Editor] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Editor]) | js.Function0[slateLib.slateMod.Controller] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Controller]) = js.native
  @JSName("moveFocusForward")
  var moveFocusForward_FEditor: js.Function0[slateLib.slateMod.Editor] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Editor]) | js.Function0[slateLib.slateMod.Controller] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Controller]) = js.native
  var moveFocusTo: (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Editor]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    slateLib.slateMod.Editor
  ]) | (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Controller]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    slateLib.slateMod.Controller
  ]) = js.native
  @JSName("moveFocusToEndOfBlock")
  var moveFocusToEndOfBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToEndOfDocument")
  var moveFocusToEndOfDocument_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToEndOfInline")
  var moveFocusToEndOfInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToEndOfNextBlock")
  var moveFocusToEndOfNextBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToEndOfNextInline")
  var moveFocusToEndOfNextInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToEndOfNextText")
  var moveFocusToEndOfNextText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var moveFocusToEndOfNode: (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Editor]) | (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Controller]) = js.native
  @JSName("moveFocusToEndOfPreviousBlock")
  var moveFocusToEndOfPreviousBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToEndOfPreviousInline")
  var moveFocusToEndOfPreviousInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToEndOfPreviousText")
  var moveFocusToEndOfPreviousText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToEndOfText")
  var moveFocusToEndOfText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToStartOfBlock")
  var moveFocusToStartOfBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToStartOfDocument")
  var moveFocusToStartOfDocument_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToStartOfInline")
  var moveFocusToStartOfInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToStartOfNextBlock")
  var moveFocusToStartOfNextBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToStartOfNextInline")
  var moveFocusToStartOfNextInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToStartOfNextText")
  var moveFocusToStartOfNextText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var moveFocusToStartOfNode: (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Editor]) | (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Controller]) = js.native
  @JSName("moveFocusToStartOfPreviousBlock")
  var moveFocusToStartOfPreviousBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToStartOfPreviousInline")
  var moveFocusToStartOfPreviousInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToStartOfPreviousText")
  var moveFocusToStartOfPreviousText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveFocusToStartOfText")
  var moveFocusToStartOfText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveForward")
  var moveForward_FEditor: js.Function0[slateLib.slateMod.Editor] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Editor]) | js.Function0[slateLib.slateMod.Controller] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Controller]) = js.native
  var moveNodeByKey: (js.Function3[
    /* key */ java.lang.String, 
    /* newKey */ java.lang.String, 
    /* newIndex */ scala.Double, 
    slateLib.slateMod.Editor
  ]) | (js.Function3[
    /* key */ java.lang.String, 
    /* newKey */ java.lang.String, 
    /* newIndex */ scala.Double, 
    slateLib.slateMod.Controller
  ]) = js.native
  var moveNodeByPath: (js.Function3[
    /* path */ slateLib.slateMod.Path, 
    /* newPath */ slateLib.slateMod.Path, 
    /* newIndex */ scala.Double, 
    slateLib.slateMod.Editor
  ]) | (js.Function3[
    /* path */ slateLib.slateMod.Path, 
    /* newPath */ slateLib.slateMod.Path, 
    /* newIndex */ scala.Double, 
    slateLib.slateMod.Controller
  ]) = js.native
  @JSName("moveStartBackward")
  var moveStartBackward_FEditor: js.Function0[slateLib.slateMod.Editor] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Editor]) | js.Function0[slateLib.slateMod.Controller] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Controller]) = js.native
  @JSName("moveStartForward")
  var moveStartForward_FEditor: js.Function0[slateLib.slateMod.Editor] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Editor]) | js.Function0[slateLib.slateMod.Controller] | (js.Function1[/* n */ scala.Double, slateLib.slateMod.Controller]) = js.native
  var moveStartTo: (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Editor]) | (js.Function2[/* path */ slateLib.slateMod.Path, /* n */ scala.Double, slateLib.slateMod.Editor]) | (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Controller]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* n */ scala.Double, 
    slateLib.slateMod.Controller
  ]) = js.native
  @JSName("moveStartToEndOfBlock")
  var moveStartToEndOfBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToEndOfDocument")
  var moveStartToEndOfDocument_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToEndOfInline")
  var moveStartToEndOfInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToEndOfNextBlock")
  var moveStartToEndOfNextBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToEndOfNextInline")
  var moveStartToEndOfNextInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToEndOfNextText")
  var moveStartToEndOfNextText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var moveStartToEndOfNode: (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Editor]) | (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Controller]) = js.native
  @JSName("moveStartToEndOfPreviousBlock")
  var moveStartToEndOfPreviousBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToEndOfPreviousInline")
  var moveStartToEndOfPreviousInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToEndOfPreviousText")
  var moveStartToEndOfPreviousText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToEndOfText")
  var moveStartToEndOfText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToStartOfBlock")
  var moveStartToStartOfBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToStartOfDocument")
  var moveStartToStartOfDocument_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToStartOfInline")
  var moveStartToStartOfInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToStartOfNextBlock")
  var moveStartToStartOfNextBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToStartOfNextInline")
  var moveStartToStartOfNextInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToStartOfNextText")
  var moveStartToStartOfNextText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var moveStartToStartOfNode: (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Editor]) | (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Controller]) = js.native
  @JSName("moveStartToStartOfPreviousBlock")
  var moveStartToStartOfPreviousBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToStartOfPreviousInline")
  var moveStartToStartOfPreviousInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToStartOfPreviousText")
  var moveStartToStartOfPreviousText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveStartToStartOfText")
  var moveStartToStartOfText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var moveTo: (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Editor]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    slateLib.slateMod.Editor
  ]) | (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Controller]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    slateLib.slateMod.Controller
  ]) = js.native
  @JSName("moveToAnchor")
  var moveToAnchor_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToEndOfBlock")
  var moveToEndOfBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToEndOfDocument")
  var moveToEndOfDocument_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToEndOfInline")
  var moveToEndOfInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToEndOfNextBlock")
  var moveToEndOfNextBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToEndOfNextInline")
  var moveToEndOfNextInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToEndOfNextText")
  var moveToEndOfNextText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var moveToEndOfNode: (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Editor]) | (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Controller]) = js.native
  @JSName("moveToEndOfPreviousBlock")
  var moveToEndOfPreviousBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToEndOfPreviousInline")
  var moveToEndOfPreviousInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToEndOfPreviousText")
  var moveToEndOfPreviousText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToEndOfText")
  var moveToEndOfText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToEnd")
  var moveToEnd_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToFocus")
  var moveToFocus_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToRangeOfDocument")
  var moveToRangeOfDocument_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var moveToRangeOfNode: (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Editor]) | (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Controller]) = js.native
  @JSName("moveToStartOfBlock")
  var moveToStartOfBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToStartOfDocument")
  var moveToStartOfDocument_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToStartOfInline")
  var moveToStartOfInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToStartOfNextBlock")
  var moveToStartOfNextBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToStartOfNextInline")
  var moveToStartOfNextInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToStartOfNextText")
  var moveToStartOfNextText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var moveToStartOfNode: (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Editor]) | (js.Function1[/* node */ slateLib.slateMod.Node, slateLib.slateMod.Controller]) = js.native
  @JSName("moveToStartOfPreviousBlock")
  var moveToStartOfPreviousBlock_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToStartOfPreviousInline")
  var moveToStartOfPreviousInline_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToStartOfPreviousText")
  var moveToStartOfPreviousText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToStartOfText")
  var moveToStartOfText_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("moveToStart")
  var moveToStart_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  @JSName("normalize")
  var normalize_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  val operations: immutableLib.immutableMod.List[slateLib.slateMod.Operation] = js.native
  val plugins: js.Array[Plugin] = js.native
  var query: (js.Function2[/* query */ java.lang.String, /* repeated */ js.Any, slateLib.slateMod.Editor]) | (js.Function2[/* query */ java.lang.String, /* repeated */ js.Any, slateLib.slateMod.Controller]) = js.native
  val readOnly: scala.Boolean = js.native
  @JSName("redo")
  var redo_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var registerCommand: (js.Function1[/* command */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* command */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var registerQuery: (js.Function1[/* query */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* query */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var removeMark: (js.Function1[/* mark */ slateLib.slateMod.Mark, slateLib.slateMod.Editor]) | (js.Function1[/* mark */ slateLib.slateMod.MarkProperties, slateLib.slateMod.Editor]) | (js.Function1[/* mark */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* mark */ slateLib.slateMod.Mark, slateLib.slateMod.Controller]) | (js.Function1[/* mark */ slateLib.slateMod.MarkProperties, slateLib.slateMod.Controller]) | (js.Function1[/* mark */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var removeMarkAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var removeMarkByKey: (js.Function4[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Controller
  ]) | (js.Function4[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var removeMarkByPath: (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Controller
  ]) | (js.Function4[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var removeNodeByKey: (js.Function1[/* key */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* key */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var removeNodeByPath: (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Editor]) | (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Controller]) = js.native
  var removeTextByKey: (js.Function3[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    slateLib.slateMod.Editor
  ]) | (js.Function3[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    slateLib.slateMod.Controller
  ]) = js.native
  var removeTextByPath: (js.Function3[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    slateLib.slateMod.Editor
  ]) | (js.Function3[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    slateLib.slateMod.Controller
  ]) = js.native
  var replaceMark: (js.Function2[
    /* mark */ slateLib.slateMod.Mark, 
    /* newMark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* mark */ slateLib.slateMod.MarkProperties, 
    /* newMark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* mark */ java.lang.String, 
    /* newMark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* mark */ slateLib.slateMod.Mark, 
    /* newMark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* mark */ slateLib.slateMod.MarkProperties, 
    /* newMark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* mark */ java.lang.String, 
    /* newMark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* mark */ slateLib.slateMod.Mark, 
    /* newMark */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* mark */ slateLib.slateMod.MarkProperties, 
    /* newMark */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* mark */ java.lang.String, 
    /* newMark */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* mark */ slateLib.slateMod.Mark, 
    /* newMark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* mark */ slateLib.slateMod.MarkProperties, 
    /* newMark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* mark */ java.lang.String, 
    /* newMark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* mark */ slateLib.slateMod.Mark, 
    /* newMark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* mark */ slateLib.slateMod.MarkProperties, 
    /* newMark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* mark */ java.lang.String, 
    /* newMark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* mark */ slateLib.slateMod.Mark, 
    /* newMark */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* mark */ slateLib.slateMod.MarkProperties, 
    /* newMark */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* mark */ java.lang.String, 
    /* newMark */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var replaceNodeByKey: (js.Function2[
    /* key */ java.lang.String, 
    /* node */ slateLib.slateMod.Node, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* node */ slateLib.slateMod.Node, 
    slateLib.slateMod.Controller
  ]) = js.native
  var replaceNodeByPath: (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* newNode */ slateLib.slateMod.Node, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* newNode */ slateLib.slateMod.Node, 
    slateLib.slateMod.Controller
  ]) = js.native
  var run: (js.Function2[/* key */ java.lang.String, /* repeated */ js.Any, slateLib.slateMod.Editor]) | (js.Function2[/* key */ java.lang.String, /* repeated */ js.Any, slateLib.slateMod.Controller]) = js.native
  var select: (js.Function1[/* properties */ slateLib.slateMod.Range, slateLib.slateMod.Editor]) | (js.Function1[/* properties */ slateLib.slateMod.RangeProperties, slateLib.slateMod.Editor]) | (js.Function1[/* properties */ slateLib.slateMod.Range, slateLib.slateMod.Controller]) | (js.Function1[/* properties */ slateLib.slateMod.RangeProperties, slateLib.slateMod.Controller]) = js.native
  var setBlocks: (js.Function1[/* properties */ slateLib.slateMod.BlockProperties, slateLib.slateMod.Editor]) | (js.Function1[/* properties */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* properties */ slateLib.slateMod.BlockProperties, slateLib.slateMod.Controller]) | (js.Function1[/* properties */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var setBlocksAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var setInlines: (js.Function1[/* properties */ slateLib.slateMod.InlineProperties, slateLib.slateMod.Editor]) | (js.Function1[/* properties */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* properties */ slateLib.slateMod.InlineProperties, slateLib.slateMod.Controller]) | (js.Function1[/* properties */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var setInlinesAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var setMarkByKey: (js.Function5[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.Mark, 
    /* properties */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function5[
    /* key */ java.lang.String, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.Mark, 
    /* properties */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Controller
  ]) = js.native
  var setMarksByPath: (js.Function5[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.Mark, 
    /* properties */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function5[
    /* path */ slateLib.slateMod.Path, 
    /* offset */ scala.Double, 
    /* length */ scala.Double, 
    /* mark */ slateLib.slateMod.Mark, 
    /* properties */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Controller
  ]) = js.native
  var setNodeByKey: (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var setNodeByPath: (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ slateLib.slateMod.NodeProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ slateLib.slateMod.NodeProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  @JSName("snapshotSelection")
  var snapshotSelection_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var splitBlock: (js.Function1[/* depth */ scala.Double, slateLib.slateMod.Editor]) | (js.Function1[/* depth */ scala.Double, slateLib.slateMod.Controller]) = js.native
  var splitBlockAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* depth */ scala.Double, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* depth */ scala.Double, 
    slateLib.slateMod.Controller
  ]) = js.native
  var splitInline: (js.Function1[/* depth */ scala.Double, slateLib.slateMod.Editor]) | (js.Function1[/* depth */ scala.Double, slateLib.slateMod.Controller]) = js.native
  var splitInlineAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* depth */ scala.Double, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* depth */ scala.Double, 
    slateLib.slateMod.Controller
  ]) = js.native
  var splitNodeByKey: (js.Function2[/* key */ java.lang.String, /* offset */ scala.Double, slateLib.slateMod.Editor]) | (js.Function2[/* key */ java.lang.String, /* offset */ scala.Double, slateLib.slateMod.Controller]) = js.native
  var splitNodeByPath: (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* position */ scala.Double, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* position */ scala.Double, 
    slateLib.slateMod.Controller
  ]) = js.native
  var toggleMark: (js.Function1[/* mark */ slateLib.slateMod.Mark, slateLib.slateMod.Editor]) | (js.Function1[/* mark */ slateLib.slateMod.MarkProperties, slateLib.slateMod.Editor]) | (js.Function1[/* mark */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* mark */ slateLib.slateMod.Mark, slateLib.slateMod.Controller]) | (js.Function1[/* mark */ slateLib.slateMod.MarkProperties, slateLib.slateMod.Controller]) | (js.Function1[/* mark */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var toggleMarkAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ slateLib.slateMod.Mark, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ slateLib.slateMod.MarkProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* mark */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  @JSName("undo")
  var undo_FEditor: js.Function0[slateLib.slateMod.Editor] | js.Function0[slateLib.slateMod.Controller] = js.native
  var unwrapBlock: (js.Function1[/* properties */ slateLib.slateMod.BlockProperties, slateLib.slateMod.Editor]) | (js.Function1[/* properties */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* properties */ slateLib.slateMod.BlockProperties, slateLib.slateMod.Controller]) | (js.Function1[/* properties */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var unwrapBlockAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var unwrapBlockByKey: (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var unwrapBlockByPath: (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var unwrapInline: (js.Function1[/* properties */ slateLib.slateMod.InlineProperties, slateLib.slateMod.Editor]) | (js.Function1[/* properties */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* properties */ slateLib.slateMod.InlineProperties, slateLib.slateMod.Controller]) | (js.Function1[/* properties */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var unwrapInlineAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var unwrapInlineByKey: (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var unwrapInlineByPath: (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var unwrapNodeByKey: (js.Function1[/* key */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* key */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var unwrapNodeByPath: (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Editor]) | (js.Function1[/* path */ slateLib.slateMod.Path, slateLib.slateMod.Controller]) = js.native
  val value: slateLib.slateMod.Value = js.native
  var withoutMerging: (js.Function1[/* fn */ js.Function0[scala.Unit], slateLib.slateMod.Editor]) | (js.Function1[/* fn */ js.Function0[scala.Unit], slateLib.slateMod.Controller]) = js.native
  var withoutNormalizing: (js.Function1[/* fn */ js.Function0[scala.Unit], slateLib.slateMod.Editor]) | (js.Function1[/* fn */ js.Function0[scala.Unit], slateLib.slateMod.Controller]) = js.native
  var withoutSaving: (js.Function1[/* fn */ js.Function0[scala.Unit], slateLib.slateMod.Editor]) | (js.Function1[/* fn */ js.Function0[scala.Unit], slateLib.slateMod.Controller]) = js.native
  var wrapBlock: (js.Function1[/* properties */ slateLib.slateMod.BlockProperties, slateLib.slateMod.Editor]) | (js.Function1[/* properties */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* properties */ slateLib.slateMod.BlockProperties, slateLib.slateMod.Controller]) | (js.Function1[/* properties */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var wrapBlockAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var wrapBlockByKey: (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ slateLib.slateMod.BlockProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var wrapBlockByPath: (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* block */ slateLib.slateMod.Block, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* block */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* block */ slateLib.slateMod.Block, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* block */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var wrapInline: (js.Function1[/* properties */ slateLib.slateMod.InlineProperties, slateLib.slateMod.Editor]) | (js.Function1[/* properties */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function1[/* properties */ slateLib.slateMod.InlineProperties, slateLib.slateMod.Controller]) | (js.Function1[/* properties */ java.lang.String, slateLib.slateMod.Controller]) = js.native
  var wrapInlineAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var wrapInlineByKey: (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var wrapInlineByPath: (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ slateLib.slateMod.InlineProperties, 
    slateLib.slateMod.Controller
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* properties */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var wrapNodeByKey: (js.Function2[
    /* key */ java.lang.String, 
    /* parent */ slateLib.slateMod.Node, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* key */ java.lang.String, 
    /* parent */ slateLib.slateMod.Node, 
    slateLib.slateMod.Controller
  ]) = js.native
  var wrapNodeByPath: (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* parent */ slateLib.slateMod.Node, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* path */ slateLib.slateMod.Path, 
    /* parent */ slateLib.slateMod.Node, 
    slateLib.slateMod.Controller
  ]) = js.native
  var wrapText: (js.Function1[/* prefix */ java.lang.String, slateLib.slateMod.Editor]) | (js.Function2[
    /* prefix */ java.lang.String, 
    /* suffix */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function1[/* prefix */ java.lang.String, slateLib.slateMod.Controller]) | (js.Function2[
    /* prefix */ java.lang.String, 
    /* suffix */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  var wrapTextAtRange: (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* prefix */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function3[
    /* range */ slateLib.slateMod.Range, 
    /* prefix */ java.lang.String, 
    /* suffix */ java.lang.String, 
    slateLib.slateMod.Editor
  ]) | (js.Function2[
    /* range */ slateLib.slateMod.Range, 
    /* prefix */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) | (js.Function3[
    /* range */ slateLib.slateMod.Range, 
    /* prefix */ java.lang.String, 
    /* suffix */ java.lang.String, 
    slateLib.slateMod.Controller
  ]) = js.native
  // Instance methods
  def resolveController(
    plugins: js.Array[Plugin],
    schema: slateLib.slateMod.SchemaProperties,
    commands: js.Array[_],
    queries: js.Array[_]
  ): scala.Unit = js.native
}

