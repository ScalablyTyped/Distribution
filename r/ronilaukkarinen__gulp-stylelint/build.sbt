organization := "org.scalablytyped"
name := "ronilaukkarinen__gulp-stylelint"
version := "14.1-dt-20230510Z-16cbc6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cosmiconfig" % "8.1.3-52d4ba",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "postcss" % "8.4.23-a62f41",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-781ad1",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "stylelint" % "15.6.1-a31609")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
