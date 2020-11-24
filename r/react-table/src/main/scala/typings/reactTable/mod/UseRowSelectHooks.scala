package typings.reactTable.mod

import typings.reactTable.anon.PartialTableToggleAllRows
import typings.reactTable.anon.PartialTableToggleRowsSel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseRowSelectHooks[D /* <: js.Object */] extends js.Object {
  
  var getToggleAllPageRowsSelectedProps: js.Array[
    PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
  ] = js.native
  
  var getToggleAllRowsSelectedProps: js.Array[
    PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
  ] = js.native
  
  var getToggleRowSelectedProps: js.Array[
    PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel]
  ] = js.native
}
object UseRowSelectHooks {
  
  @scala.inline
  def apply[D /* <: js.Object */](
    getToggleAllPageRowsSelectedProps: js.Array[
      PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
    ],
    getToggleAllRowsSelectedProps: js.Array[
      PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
    ],
    getToggleRowSelectedProps: js.Array[
      PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel]
    ]
  ): UseRowSelectHooks[D] = {
    val __obj = js.Dynamic.literal(getToggleAllPageRowsSelectedProps = getToggleAllPageRowsSelectedProps.asInstanceOf[js.Any], getToggleAllRowsSelectedProps = getToggleAllRowsSelectedProps.asInstanceOf[js.Any], getToggleRowSelectedProps = getToggleRowSelectedProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowSelectHooks[D]]
  }
  
  @scala.inline
  implicit class UseRowSelectHooksOps[Self <: UseRowSelectHooks[_], D /* <: js.Object */] (val x: Self with UseRowSelectHooks[D]) extends AnyVal {
    
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
    def setGetToggleAllPageRowsSelectedPropsVarargs(value: (PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows])*): Self = this.set("getToggleAllPageRowsSelectedProps", js.Array(value :_*))
    
    @scala.inline
    def setGetToggleAllPageRowsSelectedProps(
      value: js.Array[
          PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
        ]
    ): Self = this.set("getToggleAllPageRowsSelectedProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetToggleAllRowsSelectedPropsVarargs(value: (PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows])*): Self = this.set("getToggleAllRowsSelectedProps", js.Array(value :_*))
    
    @scala.inline
    def setGetToggleAllRowsSelectedProps(
      value: js.Array[
          PropGetter[D, TableToggleAllRowsSelectedProps, scala.Nothing, PartialTableToggleAllRows]
        ]
    ): Self = this.set("getToggleAllRowsSelectedProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetToggleRowSelectedPropsVarargs(value: (PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel])*): Self = this.set("getToggleRowSelectedProps", js.Array(value :_*))
    
    @scala.inline
    def setGetToggleRowSelectedProps(
      value: js.Array[
          PropGetter[D, TableToggleRowsSelectedProps, scala.Nothing, PartialTableToggleRowsSel]
        ]
    ): Self = this.set("getToggleRowSelectedProps", value.asInstanceOf[js.Any])
  }
}
