package typings.slate.distInterfacesEditorMod

import typings.slate.anon.Compare
import typings.slate.anon.DirtyPaths
import typings.slate.anon.FnCall
import typings.slate.distInterfacesElementMod.Element
import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesNodeMod.Ancestor
import typings.slate.distInterfacesNodeMod.Descendant
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesNodeMod.NodeEntry
import typings.slate.distInterfacesOperationMod.Operation
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesPathRefMod.PathRef
import typings.slate.distInterfacesPointMod.Point
import typings.slate.distInterfacesPointRefMod.PointRef
import typings.slate.distInterfacesRangeMod.Range
import typings.slate.distInterfacesRangeRefMod.RangeRef
import typings.slate.distInterfacesTextMod.Text
import typings.slate.distTypesTypesMod.TextUnit
import typings.slate.distUtilsTypesMod.OmitFirstArg
import typings.slate.slateStrings.text_
import typings.std.Generator
import typings.std.Omit
import typings.std.Partial
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseEditor extends StObject {
  
  def above[T /* <: Ancestor */](): js.UndefOr[NodeEntry[T]] = js.native
  def above[T /* <: Ancestor */](options: EditorAboveOptions[T]): js.UndefOr[NodeEntry[T]] = js.native
  
  var addMark: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* key */ String, 
      /* value */ Any, 
      Unit
    ]
  ] = js.native
  
  var after: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* at */ Location, 
      /* options */ js.UndefOr[EditorAfterOptions], 
      js.UndefOr[Point]
    ]
  ] = js.native
  
  @JSName("apply")
  def apply(operation: Operation): Unit = js.native
  
  var before: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* at */ Location, 
      /* options */ js.UndefOr[EditorBeforeOptions], 
      js.UndefOr[Point]
    ]
  ] = js.native
  
  var children: js.Array[Descendant] = js.native
  
  var collapse: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.collapse */ Any
  ] = js.native
  
  var delete: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.delete */ Any
  ] = js.native
  
  def deleteBackward(unit: TextUnit): Unit = js.native
  
  def deleteForward(unit: TextUnit): Unit = js.native
  
  var deleteFragment: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* options */ js.UndefOr[EditorFragmentDeletionOptions], 
      Unit
    ]
  ] = js.native
  
  var deselect: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.deselect */ Any
  ] = js.native
  
  var edges: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* at */ Location, 
      js.Tuple2[Point, Point]
    ]
  ] = js.native
  
  var elementReadOnly: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* options */ js.UndefOr[EditorElementReadOnlyOptions], 
      js.UndefOr[NodeEntry[Element]]
    ]
  ] = js.native
  
  var end: OmitFirstArg[
    js.Function2[/* editor */ typings.slate.distInterfacesEditorMod.Editor, /* at */ Location, Point]
  ] = js.native
  
  var first: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* at */ Location, 
      NodeEntry[Node]
    ]
  ] = js.native
  
  var fragment: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* at */ Location, 
      js.Array[Descendant]
    ]
  ] = js.native
  
  def getDirtyPaths(operation: Operation): js.Array[Path] = js.native
  
  def getFragment(): js.Array[Descendant] = js.native
  
  var getMarks: OmitFirstArg[
    js.Function1[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      (Omit[Text, text_]) | Null
    ]
  ] = js.native
  
  var hasBlocks: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* element */ Element, 
      Boolean
    ]
  ] = js.native
  
  var hasInlines: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* element */ Element, 
      Boolean
    ]
  ] = js.native
  
  var hasPath: OmitFirstArg[
    js.Function2[/* editor */ typings.slate.distInterfacesEditorMod.Editor, /* path */ Path, Boolean]
  ] = js.native
  
  var hasTexts: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* element */ Element, 
      Boolean
    ]
  ] = js.native
  
  var insertBreak: OmitFirstArg[js.Function1[/* editor */ typings.slate.distInterfacesEditorMod.Editor, Unit]] = js.native
  
  var insertFragment: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.insertFragment */ Any
  ] = js.native
  
  var insertNode: OmitFirstArg[FnCall] = js.native
  
  var insertNodes: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.insertNodes */ Any
  ] = js.native
  
  var insertSoftBreak: OmitFirstArg[js.Function1[/* editor */ typings.slate.distInterfacesEditorMod.Editor, Unit]] = js.native
  
  var insertText: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.insertText */ Any
  ] = js.native
  
  var isBlock: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* value */ Element, 
      Boolean
    ]
  ] = js.native
  
  var isEdge: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* point */ Point, 
      /* at */ Location, 
      Boolean
    ]
  ] = js.native
  
  def isElementReadOnly(element: Element): Boolean = js.native
  
  var isEmpty: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* element */ Element, 
      Boolean
    ]
  ] = js.native
  
  var isEnd: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* point */ Point, 
      /* at */ Location, 
      Boolean
    ]
  ] = js.native
  
  var isInline: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* value */ Element, 
      Boolean
    ]
  ] = js.native
  
  var isNormalizing: OmitFirstArg[js.Function1[/* editor */ typings.slate.distInterfacesEditorMod.Editor, Boolean]] = js.native
  
  def isSelectable(element: Element): Boolean = js.native
  
  var isStart: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* point */ Point, 
      /* at */ Location, 
      Boolean
    ]
  ] = js.native
  
  var isVoid: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* value */ Element, 
      Boolean
    ]
  ] = js.native
  
  var last: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* at */ Location, 
      NodeEntry[Node]
    ]
  ] = js.native
  
  var leaf: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* at */ Location, 
      /* options */ js.UndefOr[EditorLeafOptions], 
      NodeEntry[Text]
    ]
  ] = js.native
  
  def levels[T /* <: Node */](): Generator[NodeEntry[T], Unit, Unit] = js.native
  def levels[T /* <: Node */](options: EditorLevelsOptions[T]): Generator[NodeEntry[T], Unit, Unit] = js.native
  
  var liftNodes: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.liftNodes */ Any
  ] = js.native
  
  def markableVoid(element: Element): Boolean = js.native
  
  var marks: EditorMarks | Null = js.native
  
  var mergeNodes: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.mergeNodes */ Any
  ] = js.native
  
  var move: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.move */ Any
  ] = js.native
  
  var moveNodes: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.moveNodes */ Any
  ] = js.native
  
  def next[T /* <: Descendant */](): js.UndefOr[NodeEntry[T]] = js.native
  def next[T /* <: Descendant */](options: EditorNextOptions[T]): js.UndefOr[NodeEntry[T]] = js.native
  
  var node: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* at */ Location, 
      /* options */ js.UndefOr[EditorNodeOptions], 
      NodeEntry[Node]
    ]
  ] = js.native
  
  def nodes[T /* <: Node */](): Generator[NodeEntry[T], Unit, Unit] = js.native
  def nodes[T /* <: Node */](options: EditorNodesOptions[T]): Generator[NodeEntry[T], Unit, Unit] = js.native
  
  var normalize: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* options */ js.UndefOr[EditorNormalizeOptions], 
      Unit
    ]
  ] = js.native
  
  def normalizeNode(entry: NodeEntry[Node]): Unit = js.native
  def normalizeNode(entry: NodeEntry[Node], options: typings.slate.anon.Operation): Unit = js.native
  
  def onChange(): Unit = js.native
  def onChange(options: typings.slate.anon.Operation): Unit = js.native
  
  var operations: js.Array[Operation] = js.native
  
  var parent: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* at */ Location, 
      /* options */ js.UndefOr[EditorParentOptions], 
      NodeEntry[Ancestor]
    ]
  ] = js.native
  
  var path: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* at */ Location, 
      /* options */ js.UndefOr[EditorPathOptions], 
      Path
    ]
  ] = js.native
  
  var pathRef: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* path */ Path, 
      /* options */ js.UndefOr[EditorPathRefOptions], 
      PathRef
    ]
  ] = js.native
  
  var pathRefs: OmitFirstArg[
    js.Function1[/* editor */ typings.slate.distInterfacesEditorMod.Editor, Set[PathRef]]
  ] = js.native
  
  var point: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* at */ Location, 
      /* options */ js.UndefOr[EditorPointOptions], 
      Point
    ]
  ] = js.native
  
  var pointRef: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* point */ Point, 
      /* options */ js.UndefOr[EditorPointRefOptions], 
      PointRef
    ]
  ] = js.native
  
  var pointRefs: OmitFirstArg[
    js.Function1[/* editor */ typings.slate.distInterfacesEditorMod.Editor, Set[PointRef]]
  ] = js.native
  
  var positions: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* options */ js.UndefOr[EditorPositionsOptions], 
      Generator[Point, Unit, Unit]
    ]
  ] = js.native
  
  def previous[T /* <: Node */](): js.UndefOr[NodeEntry[T]] = js.native
  def previous[T /* <: Node */](options: EditorPreviousOptions[T]): js.UndefOr[NodeEntry[T]] = js.native
  
  var range: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* at */ Location, 
      /* to */ js.UndefOr[Location], 
      Range
    ]
  ] = js.native
  
  var rangeRef: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* range */ Range, 
      /* options */ js.UndefOr[EditorRangeRefOptions], 
      RangeRef
    ]
  ] = js.native
  
  var rangeRefs: OmitFirstArg[
    js.Function1[/* editor */ typings.slate.distInterfacesEditorMod.Editor, Set[RangeRef]]
  ] = js.native
  
  var removeMark: OmitFirstArg[
    js.Function2[/* editor */ typings.slate.distInterfacesEditorMod.Editor, /* key */ String, Unit]
  ] = js.native
  
  var removeNodes: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.removeNodes */ Any
  ] = js.native
  
  var select: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.select */ Any
  ] = js.native
  
  var selection: Selection = js.native
  
  def setNodes[T /* <: Node */](props: Partial[T]): Unit = js.native
  def setNodes[T /* <: Node */](props: Partial[T], options: Compare[T]): Unit = js.native
  
  var setNormalizing: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* isNormalizing */ Boolean, 
      Unit
    ]
  ] = js.native
  
  var setPoint: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.setPoint */ Any
  ] = js.native
  
  var setSelection: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.setSelection */ Any
  ] = js.native
  
  def shouldNormalize(param0: DirtyPaths): Boolean = js.native
  
  var splitNodes: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.splitNodes */ Any
  ] = js.native
  
  var start: OmitFirstArg[
    js.Function2[/* editor */ typings.slate.distInterfacesEditorMod.Editor, /* at */ Location, Point]
  ] = js.native
  
  var string: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* at */ Location, 
      /* options */ js.UndefOr[EditorStringOptions], 
      String
    ]
  ] = js.native
  
  var unhangRange: OmitFirstArg[
    js.Function3[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* range */ Range, 
      /* options */ js.UndefOr[EditorUnhangRangeOptions], 
      Range
    ]
  ] = js.native
  
  var unsetNodes: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.unsetNodes */ Any
  ] = js.native
  
  var unwrapNodes: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.unwrapNodes */ Any
  ] = js.native
  
  var void: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* options */ js.UndefOr[EditorVoidOptions], 
      js.UndefOr[NodeEntry[Element]]
    ]
  ] = js.native
  
  var withoutNormalizing: OmitFirstArg[
    js.Function2[
      /* editor */ typings.slate.distInterfacesEditorMod.Editor, 
      /* fn */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  
  var wrapNodes: OmitFirstArg[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Transforms.wrapNodes */ Any
  ] = js.native
}
