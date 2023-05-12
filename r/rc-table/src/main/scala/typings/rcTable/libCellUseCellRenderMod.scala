package typings.rcTable

import typings.rcTable.libInterfaceMod.CellType
import typings.rcTable.libInterfaceMod.DataIndex
import typings.rcTable.libInterfaceMod.RenderedCell
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCellUseCellRenderMod {
  
  @JSImport("rc-table/lib/Cell/useCellRender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RecordType](record: RecordType, dataIndex: DataIndex, renderIndex: Double): (js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode]]
  inline def default[RecordType](
    record: RecordType,
    dataIndex: DataIndex,
    renderIndex: Double,
    children: Unit,
    render: js.UndefOr[
      js.Function3[
        /* value */ Any, 
        /* record */ RecordType, 
        /* index */ Double, 
        ReactNode | RenderedCell[RecordType]
      ]
    ]
  ): (js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any], children.asInstanceOf[js.Any], render.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode]]
  inline def default[RecordType](
    record: RecordType,
    dataIndex: DataIndex,
    renderIndex: Double,
    children: Unit,
    render: js.UndefOr[
      js.Function3[
        /* value */ Any, 
        /* record */ RecordType, 
        /* index */ Double, 
        ReactNode | RenderedCell[RecordType]
      ]
    ],
    shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]]
  ): (js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any], children.asInstanceOf[js.Any], render.asInstanceOf[js.Any], shouldCellUpdate.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode]]
  inline def default[RecordType](
    record: RecordType,
    dataIndex: DataIndex,
    renderIndex: Double,
    children: Unit,
    render: Unit,
    shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]]
  ): (js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any], children.asInstanceOf[js.Any], render.asInstanceOf[js.Any], shouldCellUpdate.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode]]
  inline def default[RecordType](record: RecordType, dataIndex: DataIndex, renderIndex: Double, children: ReactNode): (js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode]]
  inline def default[RecordType](
    record: RecordType,
    dataIndex: DataIndex,
    renderIndex: Double,
    children: ReactNode,
    render: js.UndefOr[
      js.Function3[
        /* value */ Any, 
        /* record */ RecordType, 
        /* index */ Double, 
        ReactNode | RenderedCell[RecordType]
      ]
    ]
  ): (js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any], children.asInstanceOf[js.Any], render.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode]]
  inline def default[RecordType](
    record: RecordType,
    dataIndex: DataIndex,
    renderIndex: Double,
    children: ReactNode,
    render: js.UndefOr[
      js.Function3[
        /* value */ Any, 
        /* record */ RecordType, 
        /* index */ Double, 
        ReactNode | RenderedCell[RecordType]
      ]
    ],
    shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]]
  ): (js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any], children.asInstanceOf[js.Any], render.asInstanceOf[js.Any], shouldCellUpdate.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode]]
  inline def default[RecordType](
    record: RecordType,
    dataIndex: DataIndex,
    renderIndex: Double,
    children: ReactNode,
    render: Unit,
    shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]]
  ): (js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any], children.asInstanceOf[js.Any], render.asInstanceOf[js.Any], shouldCellUpdate.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactNode, CellType[RecordType]]) | js.Array[ReactNode]]
}
