organization := "org.scalablytyped"
name := "sanitize-html"
version := "2.6-dt-20220111Z-d8e076"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "dom-serializer" % "2.0.0-044aba",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-b522a9",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-1b82ef",
  "org.scalablytyped" %%% "domutils" % "3.0.1-0b2a23",
  "org.scalablytyped" %%% "htmlparser2" % "8.0.1-0f9c14",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
