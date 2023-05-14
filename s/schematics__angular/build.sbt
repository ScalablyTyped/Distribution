organization := "org.scalablytyped"
name := "schematics__angular"
version := "16.0.1-02fe3b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.12.0-aebde1",
  "org.scalablytyped" %%% "angular-devkit__core" % "16.0.1-32d515",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "16.0.1-50c205",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-59c48d",
  "org.scalablytyped" %%% "magic-string" % "0.30.0-c7f539",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "re2" % "1.18.0-6019fb",
  "org.scalablytyped" %%% "rxjs" % "7.8.1-1301bf",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e1e422",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-347272")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
