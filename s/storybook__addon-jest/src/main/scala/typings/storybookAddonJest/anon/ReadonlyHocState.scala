package typings.storybookAddonJest.anon

import typings.storybookAddonJest.provideJestResultMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@storybook/addon-jest.@storybook/addon-jest/dist/hoc/provideJestResult.HocState> */
@js.native
trait ReadonlyHocState extends js.Object {
  val kind: js.UndefOr[String] = js.native
  val storyName: js.UndefOr[String] = js.native
  val tests: js.UndefOr[js.Array[Test]] = js.native
}

object ReadonlyHocState {
  @scala.inline
  def apply(): ReadonlyHocState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyHocState]
  }
  @scala.inline
  implicit class ReadonlyHocStateOps[Self <: ReadonlyHocState] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setStoryName(value: String): Self = this.set("storyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoryName: Self = this.set("storyName", js.undefined)
    @scala.inline
    def setTestsVarargs(value: Test*): Self = this.set("tests", js.Array(value :_*))
    @scala.inline
    def setTests(value: js.Array[Test]): Self = this.set("tests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTests: Self = this.set("tests", js.undefined)
  }
  
}

