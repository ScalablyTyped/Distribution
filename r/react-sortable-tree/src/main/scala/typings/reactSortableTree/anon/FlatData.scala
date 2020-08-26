package typings.reactSortableTree.anon

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatData[T, I /* <: String | Double */, K /* <: /* keyof T */ String */, P /* <: /* keyof T */ String */] extends js.Object {
  var flatData: NumberDictionary[T] | StringDictionary[T] = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  var getKey: js.UndefOr[
    js.Function1[
      /* item */ T, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  var getParentKey: js.UndefOr[
    js.Function1[
      /* item */ T, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
    ]
  ] = js.native
  var rootKey: js.UndefOr[I] = js.native
}

object FlatData {
  @scala.inline
  def apply[T, /* <: java.lang.String | scala.Double */ I, /* <: / * keyof T * / java.lang.String */ K, /* <: / * keyof T * / java.lang.String */ P](flatData: NumberDictionary[T] | StringDictionary[T]): FlatData[T, I, K, P] = {
    val __obj = js.Dynamic.literal(flatData = flatData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatData[T, I, K, P]]
  }
  @scala.inline
  implicit class FlatDataOps[Self <: FlatData[_, _, _, _], T, /* <: java.lang.String | scala.Double */ I, /* <: / * keyof T * / java.lang.String */ K, /* <: / * keyof T * / java.lang.String */ P] (val x: Self with (FlatData[T, I, K, P])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlatData(value: NumberDictionary[T] | StringDictionary[T]): Self = this.set("flatData", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetKey(
      value: /* item */ T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetKey: Self = this.set("getKey", js.undefined)
    @scala.inline
    def setGetParentKey(
      value: /* item */ T => /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
    ): Self = this.set("getParentKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetParentKey: Self = this.set("getParentKey", js.undefined)
    @scala.inline
    def setRootKey(value: I): Self = this.set("rootKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootKey: Self = this.set("rootKey", js.undefined)
  }
  
}

