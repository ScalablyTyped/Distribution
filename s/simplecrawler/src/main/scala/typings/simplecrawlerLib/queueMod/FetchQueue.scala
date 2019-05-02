package typings
package simplecrawlerLib.queueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchQueue
  extends stdLib.Array[
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for T */ js.Any
    ] {
  def add(queueItem: QueueItem): scala.Unit = js.native
  def add(queueItem: QueueItem, force: scala.Boolean): scala.Unit = js.native
  def add(
    queueItem: QueueItem,
    force: scala.Boolean,
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* queueItem */ js.UndefOr[QueueItem], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def avg(statisticName: java.lang.String): scala.Unit = js.native
  def avg(
    statisticName: java.lang.String,
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* average */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def countItems(comparator: js.Object): scala.Unit = js.native
  def countItems(
    comparator: js.Object,
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* count */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def defrost(filename: java.lang.String): scala.Unit = js.native
  def defrost(
    filename: java.lang.String,
    callback: js.Function1[/* error */ js.UndefOr[simplecrawlerLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def exists(
    url: java.lang.String,
    callback: js.Function2[
      /* error */ simplecrawlerLib.Error | scala.Null, 
      /* exists */ simplecrawlerLib.simplecrawlerLibNumbers.`0` | simplecrawlerLib.simplecrawlerLibNumbers.`1`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def filterItems(comparator: js.Object): scala.Unit = js.native
  def filterItems(
    comparator: js.Object,
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* items */ js.UndefOr[js.Array[QueueItem]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def freeze(filename: java.lang.String): scala.Unit = js.native
  def freeze(
    filename: java.lang.String,
    callback: js.Function1[/* error */ js.UndefOr[simplecrawlerLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def get(index: scala.Double): scala.Unit = js.native
  def get(
    index: scala.Double,
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* queueItem */ js.UndefOr[QueueItem], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getLength(): scala.Unit = js.native
  def getLength(
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* length */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def max(statisticName: java.lang.String): scala.Unit = js.native
  def max(
    statisticName: java.lang.String,
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* maximum */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def min(statisticName: java.lang.String): scala.Unit = js.native
  def min(
    statisticName: java.lang.String,
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* minimum */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def oldestUnfetchedItem(): scala.Unit = js.native
  def oldestUnfetchedItem(
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* queueItem */ js.UndefOr[QueueItem], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def update(id: scala.Double, updates: js.Object): scala.Unit = js.native
  def update(
    id: scala.Double,
    updates: js.Object,
    callback: js.Function2[
      /* error */ js.UndefOr[simplecrawlerLib.Error], 
      /* queueItem */ js.UndefOr[QueueItem], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

