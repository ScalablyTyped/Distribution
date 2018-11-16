package typings
package prosemirrorDashCommandsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-commands", JSImport.Namespace)
@js.native
object prosemirrorDashCommandsMod extends js.Object {
  def autoJoin[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    command: js.Function2[
      /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      /* p1 */ js.UndefOr[
        js.Function1[
          /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
          scala.Unit
        ]
      ], 
      scala.Boolean
    ],
    isJoinable: js.Array[java.lang.String]
  ): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* p1 */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
  def autoJoin[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    command: js.Function2[
      /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      /* p1 */ js.UndefOr[
        js.Function1[
          /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
          scala.Unit
        ]
      ], 
      scala.Boolean
    ],
    isJoinable: js.Function2[
      /* before */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
      /* after */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
      scala.Boolean
    ]
  ): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* p1 */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
  def chainCommands[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    commands: (js.Function3[
      /* p1 */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
      /* p2 */ js.UndefOr[
        js.Function1[
          /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
          scala.Unit
        ]
      ], 
      /* p3 */ js.UndefOr[prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S]], 
      scala.Boolean
    ])*
  ): js.Function3[
    /* p1 */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* p2 */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    /* p3 */ js.UndefOr[prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S]], 
    scala.Boolean
  ] = js.native
  def createParagraphNear[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def createParagraphNear[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def deleteSelection[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def deleteSelection[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def exitCode[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def exitCode[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def joinBackward[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def joinBackward[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def joinBackward[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ],
    view: prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S]
  ): scala.Boolean = js.native
  def joinDown[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def joinDown[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def joinForward[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def joinForward[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def joinForward[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ],
    view: prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S]
  ): scala.Boolean = js.native
  def joinUp[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def joinUp[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def lift[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def lift[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def liftEmptyBlock[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def liftEmptyBlock[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def newlineInCode[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def newlineInCode[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def selectAll[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def selectAll[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def selectNodeBackward[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def selectNodeBackward[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def selectNodeBackward[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ],
    view: prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S]
  ): scala.Boolean = js.native
  def selectNodeForward[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def selectNodeForward[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def selectNodeForward[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ],
    view: prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S]
  ): scala.Boolean = js.native
  def selectParentNode[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def selectParentNode[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def setBlockType[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* dispatch */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
  def setBlockType[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    attrs: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* dispatch */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
  def splitBlock[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def splitBlock[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def splitBlockKeepMarks[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def splitBlockKeepMarks[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def toggleMark[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](markType: prosemirrorDashModelLib.prosemirrorDashModelMod.MarkType[S]): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* dispatch */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
  def toggleMark[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    markType: prosemirrorDashModelLib.prosemirrorDashModelMod.MarkType[S],
    attrs: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* dispatch */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
  def wrapIn[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* dispatch */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
  def wrapIn[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    attrs: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* dispatch */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
  @js.native
  object baseKeymap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[js.Any]
  
  @js.native
  object macBaseKeymap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[js.Any]
  
  @js.native
  object pcBaseKeymap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[js.Any]
  
}

