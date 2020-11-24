package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordProxy[T] extends js.Object {
  
  def copyFieldsFrom(source: RecordProxy[js.Object]): Unit = js.native
  
  def getDataID(): DataID = js.native
  
  // If a parent type is provided, provide the child type
  def getLinkedRecord[K /* <: /* keyof T */ String */](name: K): RecordProxy[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.native
  def getLinkedRecord[K /* <: /* keyof T */ String */](name: K, args: Variables): RecordProxy[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.native
  // If a hint is provided, the return value is guaranteed to be the hint type
  def getLinkedRecord[H](name: String): (RecordProxy[H | js.Object]) | Null = js.native
  def getLinkedRecord[H](name: String, args: Variables): (RecordProxy[H | js.Object]) | Null = js.native
  
  def getLinkedRecords[K /* <: /* keyof T */ String */](name: K): js.Array[
    RecordProxy[
      Unarray[
        NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
      ]
    ]
  ] = js.native
  def getLinkedRecords[K /* <: /* keyof T */ String */](name: K, args: Variables): js.Array[
    RecordProxy[
      Unarray[
        NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
      ]
    ]
  ] = js.native
  def getLinkedRecords[H](name: String): (js.Array[RecordProxy[_ | js.Object]]) | Null = js.native
  def getLinkedRecords[H](name: String, args: Variables): (js.Array[RecordProxy[_ | js.Object]]) | Null = js.native
  
  def getOrCreateLinkedRecord(name: String, typeName: String): RecordProxy[T] = js.native
  def getOrCreateLinkedRecord(name: String, typeName: String, args: Variables): RecordProxy[T] = js.native
  
  def getType(): String = js.native
  
  def getValue(name: String): Primitive | js.Array[Primitive] = js.native
  def getValue(name: String, args: Variables): Primitive | js.Array[Primitive] = js.native
  def getValue[K /* <: /* keyof T */ String */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  def getValue[K /* <: /* keyof T */ String */](name: K, args: Variables): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  
  def invalidateRecord(): Unit = js.native
  
  def setLinkedRecord(record: Null, name: String): RecordProxy[js.Object] = js.native
  def setLinkedRecord(record: Null, name: String, args: Variables): RecordProxy[js.Object] = js.native
  def setLinkedRecord(record: RecordProxy[js.Object], name: String): RecordProxy[js.Object] = js.native
  def setLinkedRecord(record: RecordProxy[js.Object], name: String, args: Variables): RecordProxy[js.Object] = js.native
  def setLinkedRecord[K /* <: /* keyof T */ String */](record: Null, name: K): RecordProxy[T] = js.native
  def setLinkedRecord[K /* <: /* keyof T */ String */](record: Null, name: K, args: Variables): RecordProxy[T] = js.native
  def setLinkedRecord[K /* <: /* keyof T */ String */](
    record: RecordProxy[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ],
    name: K
  ): RecordProxy[T] = js.native
  def setLinkedRecord[K /* <: /* keyof T */ String */](
    record: RecordProxy[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ],
    name: K,
    args: Variables
  ): RecordProxy[T] = js.native
  
  def setLinkedRecords(records: js.UndefOr[scala.Nothing], name: String): RecordProxy[T] = js.native
  def setLinkedRecords(records: js.UndefOr[scala.Nothing], name: String, args: Variables): RecordProxy[T] = js.native
  def setLinkedRecords(records: js.Array[RecordProxy[js.Object] | Null], name: String): RecordProxy[T] = js.native
  def setLinkedRecords(records: js.Array[RecordProxy[js.Object] | Null], name: String, args: Variables): RecordProxy[T] = js.native
  def setLinkedRecords(records: Null, name: String): RecordProxy[T] = js.native
  def setLinkedRecords(records: Null, name: String, args: Variables): RecordProxy[T] = js.native
  def setLinkedRecords[K /* <: /* keyof T */ String */](records: js.UndefOr[scala.Nothing], name: K): RecordProxy[T] = js.native
  def setLinkedRecords[K /* <: /* keyof T */ String */](records: js.UndefOr[scala.Nothing], name: K, args: Variables): RecordProxy[T] = js.native
  def setLinkedRecords[K /* <: /* keyof T */ String */](
    records: js.Array[
      (RecordProxy[
        Unarray[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
      ]) | Null
    ],
    name: K
  ): RecordProxy[T] = js.native
  def setLinkedRecords[K /* <: /* keyof T */ String */](
    records: js.Array[
      (RecordProxy[
        Unarray[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
      ]) | Null
    ],
    name: K,
    args: Variables
  ): RecordProxy[T] = js.native
  def setLinkedRecords[K /* <: /* keyof T */ String */](records: Null, name: K): RecordProxy[T] = js.native
  def setLinkedRecords[K /* <: /* keyof T */ String */](records: Null, name: K, args: Variables): RecordProxy[T] = js.native
  
  def setValue(value: js.Array[Primitive], name: String): RecordProxy[js.Object] = js.native
  def setValue(value: js.Array[Primitive], name: String, args: Variables): RecordProxy[js.Object] = js.native
  def setValue(value: Primitive, name: String): RecordProxy[js.Object] = js.native
  def setValue(value: Primitive, name: String, args: Variables): RecordProxy[js.Object] = js.native
  def setValue[K /* <: /* keyof T */ String */](
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any,
    name: K
  ): RecordProxy[T] = js.native
  def setValue[K /* <: /* keyof T */ String */](
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any,
    name: K,
    args: Variables
  ): RecordProxy[T] = js.native
}
