package typings.sparkpost

import typings.sparkpost.sparkpostMod.Callback
import typings.sparkpost.sparkpostMod.CreateTemplate
import typings.sparkpost.sparkpostMod.ResultsCallback
import typings.sparkpost.sparkpostMod.ResultsPromise
import typings.sparkpost.sparkpostMod.Template
import typings.sparkpost.sparkpostMod.TemplateContent
import typings.sparkpost.sparkpostMod.TemplateMeta
import typings.sparkpost.sparkpostMod.UpdateTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackCreateDeleteGet extends js.Object {
  /**
    * Create a new template
    *
    * @param template an object of [template attributes]{@link https://developers.sparkpost.com/api/templates#header-template-attributes}
    * @returns The template id results
    */
  def create(template: CreateTemplate): ResultsPromise[Anon_Id] = js.native
  /**
    * Create a new template
    *
    * @param template an object of [template attributes]{@link https://developers.sparkpost.com/api/templates#header-template-attributes}
    * @param callback The request callback with template id results
    */
  def create(template: CreateTemplate, callback: ResultsCallback[Anon_Id]): Unit = js.native
  /**
    * Delete an existing template
    *
    * @param id The template id
    * @returns Promise void
    */
  def delete(id: String): js.Promise[Unit] = js.native
  /**
    * Delete an existing template
    * @param id The template id
    * @param callback The request callback
    */
  def delete(id: String, callback: Callback[Unit]): Unit = js.native
  /**
    * Retrieve details about a specified template by its id
    *
    * @param id the id of the template you want to look up
    * @param [options] specifies a draft or published template
    * @returns The Template results
    */
  def get(id: String): ResultsPromise[Template] = js.native
  /**
    * Retrieve details about a specified template by its id
    *
    * @param id the id of the template you want to look up
    * @param callback The request callback with Template results
    */
  def get(id: String, callback: ResultsCallback[Template]): Unit = js.native
  def get(id: String, options: Anon_Draft): ResultsPromise[Template] = js.native
  /**
    * Retrieve details about a specified template by its id
    *
    * @param id the id of the template you want to look up
    * @param options specifies a draft or published template
    * @param callback The request callback with Template results
    */
  def get(id: String, options: Anon_Draft, callback: ResultsCallback[Template]): Unit = js.native
  /**
    * List a summary of all templates.
    *
    * @returns The TemplateMeta results array
    */
  def list(): ResultsPromise[js.Array[TemplateMeta]] = js.native
  /**
    * List a summary of all templates.
    * @param callback The request callback with TemplateMeta results array
    */
  def list(callback: ResultsCallback[js.Array[TemplateMeta]]): Unit = js.native
  /**
    * Preview the most recent version of an existing template by id
    *
    * @param id the id of the template you want to look up
    * @returns The webhook id results
    */
  def preview(id: String): ResultsPromise[TemplateContent] = js.native
  /**
    * Preview the most recent version of an existing template by id
    *
    * @param id the id of the template you want to look up
    * @param callback The request callback with webhook id results
    */
  def preview(id: String, callback: ResultsCallback[TemplateContent]): Unit = js.native
  def preview(id: String, options: Anon_DraftSubstitutiondata): ResultsPromise[TemplateContent] = js.native
  /**
    * Preview the most recent version of an existing template by id
    *
    * @param id the id of the template you want to look up
    * @param options The preview options
    * @param callback The request callback with webhook id results
    */
  def preview(id: String, options: Anon_DraftSubstitutiondata, callback: ResultsCallback[TemplateContent]): Unit = js.native
  /**
    * Update an existing template
    *
    * @param id the id of the template you want to update
    * @param template an object of [template attributes]{@link https://developers.sparkpost.com/api/templates#header-template-attributes}
    * @param options If true, directly overwrite the existing published template. If false, create a new draft
    * @returns The template id results
    */
  def update(id: String, template: UpdateTemplate): ResultsPromise[Anon_Id] = js.native
  /**
    * Update an existing template
    *
    * @param id the id of the template you want to update
    * @param template an object of [template attributes]{@link https://developers.sparkpost.com/api/templates#header-template-attributes}
    * @param callback The request callback with template id results
    */
  def update(id: String, template: UpdateTemplate, callback: ResultsCallback[Anon_Id]): Unit = js.native
  def update(id: String, template: UpdateTemplate, options: Anon_Updatepublished): ResultsPromise[Anon_Id] = js.native
  /**
    * Update an existing template
    *
    * @param id the id of the template you want to update
    * @param template an object of [template attributes]{@link https://developers.sparkpost.com/api/templates#header-template-attributes}
    * @param options The create options. If true, directly overwrite the existing published template. If false, create a new draft
    * @param callback The request callback with template id results
    */
  def update(
    id: String,
    template: UpdateTemplate,
    options: Anon_Updatepublished,
    callback: ResultsCallback[Anon_Id]
  ): Unit = js.native
}

